package io.github.brfernandes.apiacesso.core.ports;

import io.github.brfernandes.apiacesso.adapter.entities.PersonEntity;
import io.github.brfernandes.apiacesso.core.domain.Person;

public interface PersonRepositoryPort {

    public PersonEntity createPerson(Person person);
}
