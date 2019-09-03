package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="orderdetails")
public class OrderDetail implements Serializable {


    @Id
    @ManyToOne
    @JoinColumn(name = "productCode")
    private Product product;
    @Id
    @ManyToOne
    @JoinColumn(name="orderNumber")
    private Order orderNumber;
    @Column(precision =11)
    private int quantityOrdered;
    @Column(precision = 10, scale = 2)
    private BigDecimal priceEach;
    @Column(precision = 6)
    private short orderLineNumber;

    public Product getProduct() {
        return product;
    }

    public OrderDetail setProduct(Product product) {
        this.product = product;
        return this;
    }

    public Order getOrderNumber() {
        return orderNumber;
    }

    public OrderDetail setOrderNumber(Order orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public OrderDetail setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
        return this;
    }

    public BigDecimal getPriceEach() {
        return priceEach;
    }

    public OrderDetail setPriceEach(BigDecimal priceEach) {
        this.priceEach = priceEach;
        return this;
    }

    public short getOrderLineNumber() {
        return orderLineNumber;
    }

    public OrderDetail setOrderLineNumber(short orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
        return this;
    }
}
