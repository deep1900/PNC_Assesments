package com.example.userapplication.model;

import com.example.userapplication.Exception.AccountErrorException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    /*
    user attributes:
    1. First Name
    2. Last Name
    3. Address(It might have a different class)
    4. Acc Number
     */
    @Id
    @Column(name = "Id")
    private long id;
    @Column(name = "FirstName")
    private String first_name;
    @Column(name="LastName")
    private String last_name;
    @Column(name="Address")
    private String address;
    @Column(name = "Account_Number")
    private long account_number;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {

        if (first_name.isEmpty()) {
            throw new NullPointerException("Please Provide First Name");
        } else {
            this.first_name = first_name;
        }
    }

    public String getLast_name() {

        return last_name;
    }

    public void setLast_name(String last_name) {
        if (last_name.isEmpty()) {
            throw new NullPointerException("Please Provide Last Name");
        } else {
            this.last_name = last_name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) throws AccountErrorException {
        String acc_number = String.valueOf(account_number);

        if (acc_number.length() == 10) {
            long ac_number = Long.parseLong(acc_number);
            this.account_number = account_number;
        } else {
            String name = this.first_name;
            throw new AccountErrorException("Please Verify the Account Number for " + name);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", account_number=" + account_number +
                '}';
    }
}
