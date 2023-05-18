
package com.historialclinico.historial.persistence.mapper.person;

import com.historialclinico.historial.domain.dto.person.GenreDTO;
import com.historialclinico.historial.persistence.entity.person.Genre;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreMapper {
    
    GenreDTO toGenreDTO(Genre genre);
    List<GenreDTO> toGenreDTOs(List<Genre> genres);
}
