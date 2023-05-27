
package com.historialclinico.historial.web.controller.person;

import com.historialclinico.historial.domain.dto.person.PersonDTO;
import com.historialclinico.historial.domain.service.person.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/person")
public class PersonController {
    
    @Autowired
    private PersonService service;
    
    @GetMapping("all")
    public ResponseEntity<List<PersonDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("{dpi}")
    public ResponseEntity<PersonDTO> getByDpi(@PathVariable("dpi") long dpi){
    return service.getByDpi(dpi)
            .map(person -> new ResponseEntity<>(person, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }    
        
    @PostMapping("save")
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO){
    return  new ResponseEntity<>(service.save(personDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") long id){
        if(service.delete(id)){
            return new ResponseEntity( HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
