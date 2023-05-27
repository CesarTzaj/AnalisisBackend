
package com.historialclinico.historial.web.controller.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.*;
import com.historialclinico.historial.domain.service.medicalRecord.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("prescription")
public class PrescriptionController {
    
    @Autowired
    private PrescriptionService service;
    
    @Autowired
    private DrugAndExamService drugService;
    
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
    
    
    @GetMapping("drug")
    public ResponseEntity<List<DrugDTO>> getByDrugName(@RequestParam String name){
        return new ResponseEntity<>(drugService.getByDrugName(name), HttpStatus.OK);
    }
    
    @PostMapping("drug/save")
    public ResponseEntity<DrugDTO> saveDrug(@RequestBody DrugDTO drugDTO){
        return new ResponseEntity<>(drugService.saveDrug(drugDTO), HttpStatus.CREATED);
    }
}
