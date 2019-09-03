package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="offices")
public class Office {
    @Id
    @Column(length = 10)
    private String officeCode;
    @Column(length = 50)
    private String city;
    @Column(length = 50)
    private String phone;
    @Column(length = 50)
    private String addressLine1;
    @Column(length = 50)
    private String addressLine2;
    @Column(length = 50)
    private String state;
    @Column(length = 50)
    private String country;
    @Column(length = 15)
    private String postalCode;
    @Column(length = 10)
    private String territory;

    @Override
    public String toString() {
        return "Office{" +
                "officeCode='" + officeCode + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", territory='" + territory + '\'' +
                '}';
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public Office setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Office setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Office setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public Office setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public Office setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public String getState() {
        return state;
    }

    public Office setState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Office setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Office setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getTerritory() {
        return territory;
    }

    public Office setTerritory(String territory) {
        this.territory = territory;
        return this;
    }
}
