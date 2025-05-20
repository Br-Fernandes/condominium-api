package io.github.brfernandes.condominiumapi.core.ports;

import io.github.brfernandes.condominiumapi.core.domain.Visitor;

import java.util.Collection;

public interface VisitorServicePort {

    Visitor createVisitor(Visitor visitor);

    Visitor obtainByRg(String rg);

    Collection<Visitor> listAll();
}
