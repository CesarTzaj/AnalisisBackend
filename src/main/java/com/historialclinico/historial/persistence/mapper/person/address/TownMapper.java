
package com.historialclinico.historial.persistence.mapper.person.address;

import com.historialclinico.historial.domain.dto.person.address.TownDTO;
import com.historialclinico.historial.persistence.entity.person.address.Town;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TownMapper {
    
    TownDTO toTownDTO(Town town);
    
}
