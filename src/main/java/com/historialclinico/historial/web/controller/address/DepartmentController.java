
package com.historialclinico.historial.web.controller.address;


import com.historialclinico.historial.domain.dto.address.DepartmentDTO;
import com.historialclinico.historial.domain.service.address.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;
    
    @GetMapping("ordered")       
    public ResponseEntity<List<DepartmentDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping("{id}")       
    public ResponseEntity<DepartmentDTO> findById(@PathVariable("id") int id){
        return service.finById(id)
                .map(department -> new ResponseEntity<>(department, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
