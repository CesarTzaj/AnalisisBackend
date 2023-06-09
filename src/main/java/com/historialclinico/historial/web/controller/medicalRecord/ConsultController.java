
package com.historialclinico.historial.web.controller.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ConsultDTO;
import com.historialclinico.historial.domain.service.medicalRecord.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("consult")
public class ConsultController {
    
    @Autowired
    private ConsultService service;
    
    @PostMapping("save")
    private ResponseEntity<ConsultDTO> save(@RequestBody ConsultDTO consultDTO){
        return new ResponseEntity<>(service.save(consultDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("delete/{id}")
    private ResponseEntity delete(@PathVariable("id") int id){
        if (service.delete(id)) {
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
