
package com.historialclinico.historial.web.controller.person;

import com.historialclinico.historial.domain.dto.person.PhoneNumberDTO;
import com.historialclinico.historial.domain.service.person.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("phone")
public class PhoneNumberController {
    
    @Autowired
    private PhoneNumberService service;
    
    @PostMapping("save")
    public ResponseEntity<PhoneNumberDTO> save (@RequestBody PhoneNumberDTO phoneNumberDTO){
        return new ResponseEntity<>(service.save(phoneNumberDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        if (service.delete(id)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
