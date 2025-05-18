package io.github.brfernandes.apiacesso.adapter.controller;

import io.github.brfernandes.apiacesso.adapter.converters.UserConverter;
import io.github.brfernandes.apiacesso.adapter.dtos.UserDto;
import io.github.brfernandes.apiacesso.core.domain.User;
import io.github.brfernandes.apiacesso.core.ports.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    private final UserServicePort userServicePort;
    private final UserConverter userConverter;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(@RequestBody UserDto user) {
        return userConverter
                .toDto(userServicePort.createUser(userConverter.toDomain(user)));

    }
}
