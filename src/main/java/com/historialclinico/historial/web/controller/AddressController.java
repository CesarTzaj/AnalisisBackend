
package com.historialclinico.historial.web.controller;

import com.historialclinico.historial.domain.dto.AddressDTO;
import com.historialclinico.historial.domain.service.AddressService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
