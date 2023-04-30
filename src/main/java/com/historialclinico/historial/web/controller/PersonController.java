
package com.historialclinico.historial.web.controller;

import com.historialclinico.historial.domain.dto.PersonDTO;
import com.historialclinico.historial.domain.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    
    @Autowired
    private PersonService service;
    
    @GetMapping("all")
    public ResponseEntity<List<PersonDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("save")
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO){
    return  new ResponseEntity<>(service.save(personDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        if(service.delete(id)){
            return new ResponseEntity( HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
