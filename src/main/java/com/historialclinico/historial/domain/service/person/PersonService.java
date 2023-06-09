package com.historialclinico.historial.domain.service.person;

import com.historialclinico.historial.domain.service.address.AddressService;
import com.historialclinico.historial.domain.dto.person.PersonDTO;
import com.historialclinico.historial.domain.repositoryDTO.person.PersonRepositoryDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepositoryDTO personRepositoryDTO;
    @Autowired
    private AddressService addressService;

    @Autowired
    private EmailService emailService;

    @Autowired
    private PhoneNumberService phoneNumberService;

    public List<PersonDTO> getAll() {
        return personRepositoryDTO.getAll();
    }

    public PersonDTO save(PersonDTO personDTO) {
        return personRepositoryDTO.save(personDTO);
    }

    public Optional<PersonDTO> getByDpi(long dpi) {
        return personRepositoryDTO.getByDpi(dpi);
    }

    public Boolean delete(long id) {
        return getByDpi(id)
                .map(person -> {
                    person.getAddresses()
                            .forEach(address -> addressService.delete(address.getId()));
                    person.getEmails()
                            .forEach(email -> emailService.delte(email.getId()));
                    person.getPhoneNumbers()
                            .forEach(phoneNu -> phoneNumberService.delete(phoneNu.getId()));
                    personRepositoryDTO.delete(id);

                    return true;
                }).orElse(false);
    }
}
