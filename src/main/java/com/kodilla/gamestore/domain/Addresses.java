package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Data
@Table(name = "ADDRESSES")
public class Addresses {

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ADDRESS_ID", unique = true)
    private long AddressId;

    @Column(name = "STREET_NUMBER")
    @NotNull
    private String streetNumber;

    @Column(name = "FLAT_NAME")
    private String flatNumber;

    @Column(name = "STREET_NAME")
    @NotNull
    private String streetName;

    @Column(name = "CITY")
    @NotNull
    private String city;

    @Column(name = "ZIPCODE")
    @NotNull
    private String zipCode;

    @Column(name = "COUNTRY")
    @NotNull
    private String country;

    public Addresses(String streetNumber, String flatNumber, String streetName, String city, String zipCode, String country) {
        this.streetNumber = streetNumber;
        this.flatNumber = flatNumber;
        this.streetName = streetName;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }
}
