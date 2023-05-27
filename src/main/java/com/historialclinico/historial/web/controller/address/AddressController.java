
package com.historialclinico.historial.web.controller.address;

import com.historialclinico.historial.domain.dto.address.AddressDTO;
import com.historialclinico.historial.domain.service.address.AddressService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
