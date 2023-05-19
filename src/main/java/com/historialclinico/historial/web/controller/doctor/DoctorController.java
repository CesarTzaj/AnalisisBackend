
package com.historialclinico.historial.web.controller.doctor;

import com.historialclinico.historial.domain.dto.doctor.DoctorDTO;
import com.historialclinico.historial.domain.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class DoctorController {
    
    @Autowired
    private DoctorService service;
    
    @GetMapping("{id}")
    public ResponseEntity<DoctorDTO> findById(@PathVariable("id") int id){
        return service.findById(id)
                .map(doctor -> new ResponseEntity<>(doctor, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
                
    }
}
