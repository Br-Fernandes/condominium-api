package io.github.brfernandes.condominiumapi.adapter.controller;

import io.github.brfernandes.condominiumapi.adapter.converters.UserConverter;
import io.github.brfernandes.condominiumapi.adapter.dtos.UserDto;
import io.github.brfernandes.condominiumapi.core.ports.UserServicePort;
import lombok.RequiredArgsConstructor;
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
