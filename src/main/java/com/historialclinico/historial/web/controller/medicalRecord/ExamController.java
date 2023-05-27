
package com.historialclinico.historial.web.controller.medicalRecord;
 
import com.historialclinico.historial.domain.dto.medicalRecord.*;
import com.historialclinico.historial.domain.service.medicalRecord.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("exam")
public class ExamController {
    
    @Autowired
    private ExamService examService;
    @Autowired
    private DrugAndExamService labService;
    
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
    
    //Lab list and save methods
    
    @GetMapping("type")
    public ResponseEntity<List<ExamTypeDTO>> getByLabName(@RequestParam String lab){
        return new ResponseEntity<>(labService.getByLabName(lab), HttpStatus.OK);
    }
    
    @PostMapping("type/save")
    public ResponseEntity<ExamTypeDTO> saveLab(@RequestBody ExamTypeDTO examTypeDTO){
        return new ResponseEntity<>(labService.saveLab(examTypeDTO), HttpStatus.CREATED);
    }
}
