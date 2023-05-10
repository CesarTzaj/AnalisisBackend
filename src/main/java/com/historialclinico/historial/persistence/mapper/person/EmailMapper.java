package com.historialclinico.historial.persistence.mapper.person;

import com.historialclinico.historial.domain.dto.person.EmailDTO;
import com.historialclinico.historial.persistence.entity.person.Email;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PersonMapper.class})
public interface EmailMapper {
    
    @Mappings({
        @org.mapstruct.Mapping(source = "persondpi", target = "dpi")
    })
     EmailDTO toEmailDTO(Email email);
     List<EmailDTO> toEmailDTOs(List<Email> emails);
     
     
    @InheritInverseConfiguration
    @Mappings({
        @org.mapstruct.Mapping(target = "person", ignore = true)
    })
     Email toEmail(EmailDTO emailDTO);
}
