package io.github.brfernandes.condominiumapi.core.services;

import io.github.brfernandes.condominiumapi.core.domain.Visitor;
import io.github.brfernandes.condominiumapi.core.exceptions.BusinessException;
import io.github.brfernandes.condominiumapi.core.ports.VisitorRepositoryPort;
import io.github.brfernandes.condominiumapi.core.ports.VisitorServicePort;

import java.util.Collection;

public class VisitorService implements VisitorServicePort {

    private final VisitorRepositoryPort visitorRepositoryPort;


    public VisitorService(VisitorRepositoryPort visitorRepositoryPort) {
        this.visitorRepositoryPort = visitorRepositoryPort;
    }


    @Override
    public Visitor createVisitor(Visitor visitor) {
        visitorRepositoryPort.obtainByRg(visitor.getRg())
                .ifPresent(v -> {
                    throw new BusinessException("Visitor Already Exists!");
                });

        return visitorRepositoryPort.create(visitor);
    }

    @Override
    public Visitor obtainByRg(String rg) {
        return visitorRepositoryPort.obtainByRg(rg)
                .orElseThrow(() -> new IllegalArgumentException("Visitor not found!"));
    }

    @Override
    public Collection<Visitor> listAll() {
        return visitorRepositoryPort.listAll();
    }
}
