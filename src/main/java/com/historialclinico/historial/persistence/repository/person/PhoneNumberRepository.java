package com.historialclinico.historial.persistence.repository.person;

import com.historialclinico.historial.domain.dto.person.PhoneNumberDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.PhoneNumberRepositoryDTO;
import com.historialclinico.historial.persistence.crud.person.PhoneNumberCrud;
import com.historialclinico.historial.persistence.entity.person.PhoneNumber;
import com.historialclinico.historial.persistence.mapper.person.PhoneNumberMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PhoneNumberRepository implements PhoneNumberRepositoryDTO {

    @Autowired
    private PhoneNumberMapper mapper;

    @Autowired
    private PhoneNumberCrud crud;

    @Override
    public PhoneNumberDTO save(PhoneNumberDTO phoneNumberDTO) {
        PhoneNumber phoneNumber = mapper.toPhoneNumber(phoneNumberDTO);
        return mapper.toPhoneNumberDTO(crud.save(phoneNumber));
    }

    @Override
    public Optional<PhoneNumberDTO> getById(int id) {
        return  crud.findById(id)
                .map(phoneNum -> mapper.toPhoneNumberDTO(phoneNum));
    }

    @Override
    public void delete(int id) {
        crud.deleteById(id);
    }

}
