
package com.historialclinico.historial.persistence.mapper.address;

import com.historialclinico.historial.domain.dto.address.TownDTO;
import com.historialclinico.historial.persistence.entity.address.Town;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TownMapper {
    
    TownDTO toTownDTO(Town town);
    List<TownDTO> toTownDTOs(List<Town> towns);
    
    @InheritInverseConfiguration
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "department", ignore = true)
    Town toTown(TownDTO townDTO);
}
