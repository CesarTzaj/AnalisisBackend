
package com.historialclinico.historial.persistence.repository.person;

import com.historialclinico.historial.domain.dto.person.GenreDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.GenreRepositoryDTO;
import com.historialclinico.historial.persistence.crud.person.GenreCrud;
import com.historialclinico.historial.persistence.entity.person.Genre;
import com.historialclinico.historial.persistence.mapper.person.GenreMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenreRepository implements GenreRepositoryDTO{
    
    @Autowired
    private GenreCrud crud;
    @Autowired
    private GenreMapper mapper;
    
    @Override
    public List<GenreDTO> getAll(){
        List<Genre> genres = (List<Genre>) crud.findAll();
        return mapper.toGenreDTOs(genres);
    }
}
