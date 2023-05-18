
package com.historialclinico.historial.web.controller.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.ExamDTO;
import com.historialclinico.historial.domain.service.medicalRecord.ExamService;
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
@RequestMapping("exam")
public class ExamController {
    
    @Autowired
    private ExamService examService;
    
    @PostMapping("save")
    public ResponseEntity<ExamDTO> save(@RequestBody ExamDTO examDTO){
        return new ResponseEntity<>(examService.save(examDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if (examService.delete(id)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
