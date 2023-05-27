
package com.historialclinico.historial.persistence.crud.medicalRecord;

import com.historialclinico.historial.persistence.entity.medicalRecord.Drug;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface DrugCrud extends CrudRepository<Drug, Integer>{
    List<Drug> findByMedicamentoContains(String query);
}
