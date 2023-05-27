
package com.historialclinico.historial.web.controller.medicalRecord;

import com.historialclinico.historial.domain.dto.medicalRecord.AppointmentDTO;
import com.historialclinico.historial.domain.service.medicalRecord.AppointmentService;
import java.sql.Date;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("appoint")
public class AppointmentController {
    
    @Autowired
    private AppointmentService service;
    
    @GetMapping("{dpi}")
    public ResponseEntity<List<AppointmentDTO>> getByPersonIdOrdered(@PathVariable("dpi") long dpi){
        return new ResponseEntity<>(service.getAllOrdered(dpi), HttpStatus.OK);
    }
    @GetMapping("date/{dpi}")
    public ResponseEntity<List<AppointmentDTO>> getByDpiDateRage(@PathVariable("dpi") long dpi,@RequestParam Date start, @RequestParam Date end){
        return new ResponseEntity<>(service.getByDpiDateRange(dpi, start,end), HttpStatus.OK);
    }
    @PostMapping("save")
    public ResponseEntity<AppointmentDTO> save(@RequestBody AppointmentDTO appointmentDTO){
        return new ResponseEntity<>(service.save(appointmentDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("detlete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        if(service.delete(id)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}

