package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @Column(precision = 11)
    private int employeeNumber;
    @Column(length = 50)
    private String lastName;
    @Column(length = 50)
    private String firstName;
    @Column(length = 10)
    private String extension;
    @Column(length = 100)
    private String email;
    @ManyToOne
    @JoinColumn(name="officeCode")
    //@MapsId("officeCode")
    private Office officeCode;
    @ManyToOne
    @JoinColumn(name = "reportsTo")
    private Employee reportsTo;
    @Column(length = 50)
    private String jobTitle;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Employee setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getExtension() {
        return extension;
    }

    public Employee setExtension(String extension) {
        this.extension = extension;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public Office getOfficeCode() {
        return officeCode;
    }

    public Employee setOfficeCode(Office officeCode) {
        this.officeCode = officeCode;
        return this;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public Employee setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Employee setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
}
