package io.github.brfernandes.apiacesso.adapter.converters;

import io.github.brfernandes.apiacesso.adapter.dtos.UserDto;
import io.github.brfernandes.apiacesso.core.domain.Person;
import io.github.brfernandes.apiacesso.core.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User toDomain(UserDto user) {
        return new User(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getAdmin(),
                new Person(null, user.getName())
        );
    }

    public UserDto toDto(User user) {
        return new UserDto(
                user.getId(),
                user.getPerson().getName(),
                user.getEmail(),
                user.getPassword(),
                user.getAdmin()
        );
    }
}
