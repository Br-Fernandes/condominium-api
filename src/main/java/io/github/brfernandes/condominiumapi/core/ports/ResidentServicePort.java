package io.github.brfernandes.condominiumapi.core.ports;

import io.github.brfernandes.condominiumapi.core.domain.Resident;

import java.util.Collection;

public interface ResidentServicePort {

    Resident createResident(Resident resident);

    Collection<Resident> findAll();
}
