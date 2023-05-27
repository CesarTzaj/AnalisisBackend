
package com.historialclinico.historial.web.controller.person;

import com.historialclinico.historial.domain.dto.person.BloodTypeDTO;
import com.historialclinico.historial.domain.service.person.BloodTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class BloodTypeController {
    
    @Autowired
    private BloodTypeService service;
    
    @GetMapping("blood")
    public ResponseEntity<List<BloodTypeDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
