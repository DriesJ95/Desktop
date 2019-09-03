package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment implements Serializable {
    @Id
    @Column(length = 50)
    private String checkNumber;
    private Date paymentDate;
    @Column(precision=10, scale =2)
    private BigDecimal amount;
    @Id
    @ManyToOne
    @JoinColumn(name = "customerNumber")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public Payment setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public Payment setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
        return this;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Payment setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Payment setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
}
