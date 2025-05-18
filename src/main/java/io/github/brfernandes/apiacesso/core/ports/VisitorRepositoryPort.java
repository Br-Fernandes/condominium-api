package io.github.brfernandes.apiacesso.core.ports;

import io.github.brfernandes.apiacesso.core.domain.Visitor;

import java.util.Collection;
import java.util.Optional;

public interface VisitorRepositoryPort {

    public Visitor create(Visitor visitor);

    public Optional<Visitor> obtainByRg(String rg);

    public Collection<Visitor> listAll();
}
