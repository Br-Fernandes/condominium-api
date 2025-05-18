package io.github.brfernandes.apiacesso.adapter.repositories;

import io.github.brfernandes.apiacesso.adapter.entities.PersonEntity;
import io.github.brfernandes.apiacesso.core.domain.Person;
import io.github.brfernandes.apiacesso.core.ports.PersonRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonRepositoryAdapter implements PersonRepositoryPort {

    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    @Override
    public PersonEntity createPerson(Person person) {
        PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);
        return personRepository.save(personEntity);
    }
}
