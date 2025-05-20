package io.github.brfernandes.condominiumapi.adapter.converters;

import io.github.brfernandes.condominiumapi.adapter.dtos.VisitorDto;
import io.github.brfernandes.condominiumapi.core.domain.Person;
import io.github.brfernandes.condominiumapi.core.domain.Visitor;
import org.springframework.stereotype.Component;

@Component
public class VisitorConverter {

    public Visitor toDomain(VisitorDto visitorDto) {
        return new Visitor(
                visitorDto.getId(),
                visitorDto.getRg(),
                new Person(null, visitorDto.getName())
        );
    }

    public VisitorDto toDto(Visitor visitor) {
        return new VisitorDto(
                visitor.getId(),
                visitor.getPerson().getName(),
                visitor.getRg()
        );
    }
}
