
package com.historialclinico.historial.web.controller.address;


import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import com.historialclinico.historial.domain.dto.address.TownDTO;
import com.historialclinico.historial.domain.service.address.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    
    
    @GetMapping("{id}")
    public ResponseEntity<List<TownDTO>> getByDepId(@PathVariable("id") int id){
        return new ResponseEntity<>(service.getByDepId(id), HttpStatus.OK);
    }
    
    @GetMapping("ordered")       
    public ResponseEntity<List<DepartmentDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

}
