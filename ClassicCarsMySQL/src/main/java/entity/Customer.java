package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @Column(precision = 11)
    private int customerNumber;
    @Column(length = 50)
    private String customerName;
    @Column(length = 50)
    private String contactLastName;
    @Column(length = 50)
    private String contactFirstName;
    @Column(length = 50)
    private String phone;
    @Column(length = 50)
    private String addressLine1;
    @Column(length = 50)
    private String addressLine2;
    @Column(length = 50)
    private String city;
    @Column(length = 50)
    private String state;
    @Column(length = 15)
    private String postalCode;
    @Column(length = 50)
    private String country;
    @ManyToOne
    @JoinColumn(name="salesRepEmployeeNumber")
    private Employee salesRepEmployeeNumber;
    @Column(precision = 10, scale=2)
    private BigDecimal creditLimit;



    public String getContactFirstName() {
        return contactFirstName;
    }

    public Customer setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
        return this;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public Customer setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public Customer setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public Customer setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public Customer setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Customer setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Customer setState(String state) {
        this.state = state;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Customer setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Customer setCountry(String country) {
        this.country = country;
        return this;
    }

    public Employee getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    public Customer setSalesRepEmployeeNumber(Employee salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
        return this;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public Customer setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }
}
