package com.historialclinico.historial.persistence.mapper.person;

import com.historialclinico.historial.domain.dto.person.PhoneNumberDTO;
import com.historialclinico.historial.persistence.entity.person.PhoneNumber;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring", uses = {PersonMapper.class})
public interface PhoneNumberMapper {
    
    @org.mapstruct.Mapping(source = "personadpi", target = "dpi")
    PhoneNumberDTO toPhoneNumberDTO(PhoneNumber phoneNumber);
    List<PhoneNumberDTO> toPhoneNumberDTOs(List<PhoneNumber> phoneNumber);
    

    @InheritInverseConfiguration
    @org.mapstruct.Mapping(target = "person", ignore = true)
    PhoneNumber toPhoneNumber(PhoneNumberDTO phoneNumberDTO);
    
    
}
