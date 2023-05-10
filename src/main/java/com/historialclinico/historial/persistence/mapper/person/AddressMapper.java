package com.historialclinico.historial.persistence.mapper.person;

import com.historialclinico.historial.domain.dto.person.AddressDTO;
import com.historialclinico.historial.persistence.entity.person.Address;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PersonMapper.class})
public interface AddressMapper {

    @Mappings({
        @Mapping(source = "idDireccion", target = "id"),
        @Mapping(source = "direccion", target = "address"),
        @Mapping(source = "dpi", target = "dpi"),
        
    })
    AddressDTO toAddressDTO(Address address);
    List<AddressDTO> toAddresDTOs(List<Address> address);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "person", ignore = true),
    })
    Address toAddress(AddressDTO addressDTO);
}
