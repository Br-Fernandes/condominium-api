package io.github.brfernandes.apiacesso.adapter.converters;

import io.github.brfernandes.apiacesso.adapter.dtos.UserDto;
import io.github.brfernandes.apiacesso.adapter.dtos.VisitorDto;
import io.github.brfernandes.apiacesso.core.domain.Person;
import io.github.brfernandes.apiacesso.core.domain.User;
import io.github.brfernandes.apiacesso.core.domain.Visitor;
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
