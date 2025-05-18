package io.github.brfernandes.apiacesso.core.ports;

import io.github.brfernandes.apiacesso.core.domain.Visitor;

import java.util.Collection;

public interface VisitorServicePort {

    Visitor createVisitor(Visitor visitor);

    Visitor obtainByRg(String rg);

    Collection<Visitor> listAll();
}
