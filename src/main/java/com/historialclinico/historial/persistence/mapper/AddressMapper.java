package com.historialclinico.historial.persistence.mapper;

import com.historialclinico.historial.domain.dto.AddressDTO;
import com.historialclinico.historial.persistence.entity.Address;
import java.util.List;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PersonMapper.class})
public interface AddressMapper {

    @Mappings({
        @Mapping(source = "idDireccion", target = "id"),
        @Mapping(source = "direccion", target = "address"),
        @Mapping(source = "personaid", target = "personaId"),
        })
    AddressDTO toAddressDTO(Address address);

    List<AddressDTO> toAddresDTOs(List<Address> address);

    @InheritInverseConfiguration
     @Mapping(target = "people", ignore = true)
    Address toAddress(AddressDTO addressDTO);
}
