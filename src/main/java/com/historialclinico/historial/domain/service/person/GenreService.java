
package com.historialclinico.historial.domain.service.person;

import com.historialclinico.historial.domain.dto.person.GenreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.historialclinico.historial.domain.repositoryDTO.person.GenreRepositoryDTO;
import java.util.List;

@Service
public class GenreService {
    
    @Autowired
    private GenreRepositoryDTO genreRepo;
    
    public List<GenreDTO> getAll(){
        return genreRepo.getAll();
    }
}
