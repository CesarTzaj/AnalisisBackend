
package com.historialclinico.historial.web.controller.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ClinicDTO;
import com.historialclinico.historial.domain.service.medicalRecord.ClinicService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clinic")
public class ClinicController {
    
    @Autowired
    private ClinicService service;
    
    @GetMapping("all")
    public ResponseEntity<List<ClinicDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
