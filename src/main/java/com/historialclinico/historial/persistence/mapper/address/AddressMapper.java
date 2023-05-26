package com.historialclinico.historial.persistence.mapper.address;

import com.historialclinico.historial.domain.dto.address.AddressDTO;
import com.historialclinico.historial.persistence.entity.person.address.Address;
import com.historialclinico.historial.persistence.mapper.person.PersonMapper;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {
    PersonMapper.class,
    DepartmentMapper.class,
    TownMapper.class
})
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
        @Mapping(target = "department", ignore = true),
        @Mapping(target = "town", ignore = true),
    })
    Address toAddress(AddressDTO addressDTO);
}
