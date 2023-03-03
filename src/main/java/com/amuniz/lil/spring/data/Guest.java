package com.amuniz.lil.spring.data;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "GUEST")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GUEST_ID")
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Override
    public String toString() {
        return "Guest{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", emailAddress='" + emailAddress + '\'' +
            ", address='" + address + '\'' +
            ", country='" + country + '\'' +
            ", state='" + state + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
    }
}
