
package com.historialclinico.historial.web.controller.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.PrescriptionDTO;
import com.historialclinico.historial.domain.service.medicalRecord.PrescriptionService;
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
@RequestMapping("prescription")
public class PrescriptionController {
    
    @Autowired
    private PrescriptionService service;
    
    @PostMapping("save")
    public ResponseEntity<PrescriptionDTO> save(@RequestBody PrescriptionDTO prescriptionDTO){
        return new ResponseEntity<>(service.save(prescriptionDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        if (service.delete(id)) {
            return new  ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
