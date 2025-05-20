package io.github.brfernandes.condominiumapi.core.ports;

import io.github.brfernandes.condominiumapi.core.domain.Resident;

public interface ResidentRepositoryPort {

    Resident createResident(Resident resident);

    Resident obtainByCpf(String cpf);
}
