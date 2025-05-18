package io.github.brfernandes.apiacesso.core.services;

import io.github.brfernandes.apiacesso.core.domain.Resident;
import io.github.brfernandes.apiacesso.core.ports.ResidentRepositoryPort;
import io.github.brfernandes.apiacesso.core.ports.ResidentServicePort;

import java.util.Collection;
import java.util.List;

public class ResidentService implements ResidentServicePort {

    private final ResidentRepositoryPort residentRepositoryPort;

    public ResidentService(ResidentRepositoryPort residentRepositoryPort) {
        this.residentRepositoryPort = residentRepositoryPort;
    }

    @Override
    public Resident createResident(Resident resident) {
        Resident residentExited = residentRepositoryPort.obtainByCpf(resident.getCpf());
        if (residentExited != null) {
            throw new IllegalArgumentException("Resident Already Exists!");
        }

        return residentRepositoryPort.createResident(resident);
    }

    @Override
    public Collection<Resident> findAll() {
        return List.of();
    }
}
