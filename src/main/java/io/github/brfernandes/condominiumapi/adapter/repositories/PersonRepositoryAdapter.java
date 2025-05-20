package io.github.brfernandes.condominiumapi.adapter.repositories;

import io.github.brfernandes.condominiumapi.adapter.entities.PersonEntity;
import io.github.brfernandes.condominiumapi.core.domain.Person;
import io.github.brfernandes.condominiumapi.core.ports.PersonRepositoryPort;
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
