package entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="products")
public class Product {
    @Id
    private String productCode;
    @Column(length = 70)
    private String productName;
    @ManyToOne
    @JoinColumn(name = "productLine")
    private ProductLine productLine;
    @Column(length = 10)
    private String productScale;
    @Column(length = 50)
    private String productVendor;
    @Column(columnDefinition ="text")
    private String productDescription;
    @Column(columnDefinition = "smallint")
    private short quantityInStock;
    @Column(precision=10,scale=2)
    private BigDecimal buyPrice;
    @Column(precision=10,scale=2)
    private BigDecimal MSRP;

    public String getProductCode() {
        return productCode;
    }

    public Product setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public Product setProductLine(ProductLine productLine) {
        this.productLine = productLine;
        return this;
    }

    public String getProductScale() {
        return productScale;
    }

    public Product setProductScale(String productScale) {
        this.productScale = productScale;
        return this;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public Product setProductVendor(String productVendor) {
        this.productVendor = productVendor;
        return this;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Product setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    public short getQuantityInStock() {
        return quantityInStock;
    }

    public Product setQuantityInStock(short quantityInStock) {
        this.quantityInStock = quantityInStock;
        return this;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public Product setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    public BigDecimal getMSRP() {
        return MSRP;
    }

    public Product setMSRP(BigDecimal MSRP) {
        this.MSRP = MSRP;
        return this;
    }
}
