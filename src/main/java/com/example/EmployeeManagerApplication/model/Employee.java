package com.example.EmployeeManagerApplication.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity//(name = "Employee") entity name is different form table name
@Table(name = "Employee")
public class Employee implements Serializable { //Entity Class, It will create similar kind of data model in DB.

    @Id
    @Column(name="EID", nullable = false, updatable = false)
    private Long id;
    private EmployeeName Name;
    private String gender;
    private String email;
    private String phoneNumber;
    private String jobTitle;
    @Transient//It will not be going to add this as a column in Database
    private String imageURL;

    public Employee() {

    }

    public Employee(Long id, EmployeeName name, String gender, String email, String phoneNumber, String jobTitle, String imageURL) {
        this.id = id;
        Name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.imageURL = imageURL;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public EmployeeName getName() { return Name;  }
    public void setName(EmployeeName name) { Name = name;}
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getJobTitle() { return jobTitle;  }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
    public String getImageURL() { return imageURL; }
    public void setImageURL(String imageURL) { this.imageURL = imageURL; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name=" + Name +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}