package io.github.brfernandes.condominiumapi.core.ports;

import io.github.brfernandes.condominiumapi.adapter.entities.PersonEntity;
import io.github.brfernandes.condominiumapi.core.domain.Person;

public interface PersonRepositoryPort {

    public PersonEntity createPerson(Person person);
}
