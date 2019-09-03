package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="productlines")
public class ProductLine {
    @Id
    @Column(length=50)
    private String productLine;
    @Column(length=4000)
    private String textDescription;
    @Column(columnDefinition = "mediumtext")
    private String htmlDescription;
    @Column(columnDefinition = "mediumblob")
    private byte[] image;
    @OneToMany(mappedBy = "productLine")
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public ProductLine setProductList(List<Product> productList) {
        this.productList = productList;
        return this;
    }

    public String getProductLine() {
        return productLine;
    }

    public ProductLine setProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public ProductLine setTextDescription(String textDescription) {
        this.textDescription = textDescription;
        return this;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public ProductLine setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public ProductLine setImage(byte[] image) {
        this.image = image;
        return this;
    }
}
