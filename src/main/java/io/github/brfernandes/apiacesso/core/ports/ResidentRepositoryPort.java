package io.github.brfernandes.apiacesso.core.ports;

import io.github.brfernandes.apiacesso.adapter.repositories.ResidentRepository;
import io.github.brfernandes.apiacesso.core.domain.Resident;

public interface ResidentRepositoryPort {

    Resident createResident(Resident resident);

    Resident obtainByCpf(String cpf);
}
