package com.kodilla.gamestore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddressesDto {

    private Long AddressId;
    private String streetNumber;
    private String flatNumber;
    private String streetName;
    private String city;
    private String zipCode;
    private String country;
}
