package com.kodilla.gamestore.mapper;

import com.kodilla.gamestore.domain.Addresses;
import com.kodilla.gamestore.domain.AddressesDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class AddressesMapper {

    public Addresses mapToAddress(final AddressesDto addressesDto) {
        return new Addresses(
                addressesDto.getAddressId(),
                addressesDto.getStreetNumber(),
                addressesDto.getFlatNumber(),
                addressesDto.getStreetName(),
                addressesDto.getCity(),
                addressesDto.getZipCode(),
                addressesDto.getCountry());
    }

    public AddressesDto mapToAddressesDto(Addresses address) {
        return new AddressesDto(
                address.getAddressId(),
                address.getStreetNumber(),
                address.getFlatNumber(),
                address.getStreetName(),
                address.getCity(),
                address.getZipCode(),
                address.getCountry());
    }
    public List<AddressesDto> mapToAddressesDtoList(List<Addresses> addresses) {
        return addresses.stream()
                .map(this::mapToAddressesDto)
                .collect(Collectors.toList());
    }
}
