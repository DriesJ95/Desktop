package model;

public class Company {

    private int id;
    private String name;
    private String vat;
    private String address;
    private String city;

    public Company(String name, String vat, String address, String city) {
        this.name = name;
        this.vat = vat;
        this.address = address;
        this.city = city;
    }

    public Company(){}

    public int getId() {
        return id;
    }

    public Company setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Company{id=%d, name='%s', vat='%s', address='%s', city='%s'}", id, name, vat, address, city);
    }
}
