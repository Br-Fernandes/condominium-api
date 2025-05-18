package io.github.brfernandes.apiacesso.core.ports;

import io.github.brfernandes.apiacesso.core.domain.Resident;

import java.util.Collection;

public interface ResidentServicePort {

    Resident createResident(Resident resident);

    Collection<Resident> findAll();
}
