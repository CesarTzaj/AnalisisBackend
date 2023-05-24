
package com.historialclinico.historial.web.controller.person;

import com.historialclinico.historial.domain.dto.person.address.AddressDTO;
import com.historialclinico.historial.domain.service.person.AddressService;
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
@RequestMapping("address")
public class AddressController {
    
    @Autowired
    private AddressService addressService;
    
    @GetMapping("all")
    public List<AddressDTO> getAll(){
    return addressService.getAll();
    }
    @PostMapping("save")
    public ResponseEntity<AddressDTO> save(@RequestBody AddressDTO addressDTO){
    return new ResponseEntity<>(addressService.save(addressDTO), HttpStatus.CREATED);
    }
    
        @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        if(addressService.delete(id)){
            return new ResponseEntity( HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
