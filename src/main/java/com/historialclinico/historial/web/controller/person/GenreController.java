
package com.historialclinico.historial.web.controller.person;

import com.historialclinico.historial.domain.dto.person.GenreDTO;
import com.historialclinico.historial.domain.service.person.GenreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenreController {
    
    @Autowired
    private GenreService service;
    
    @GetMapping("genre")
    public ResponseEntity<List<GenreDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
