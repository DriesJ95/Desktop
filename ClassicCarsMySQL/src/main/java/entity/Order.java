package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(precision=11)
    private int orderNumber;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    @Column(length = 15)
    private String status;
    @Column(name="comments", columnDefinition = "text")
    private String comments;
    @ManyToOne
    @JoinColumn(name = "customerNumber")
    private Customer customer;


    public int getOrderNumber() {
        return orderNumber;
    }

    public Order setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Order setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public Order setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
        return this;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public Order setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Order setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public Order setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }
}
