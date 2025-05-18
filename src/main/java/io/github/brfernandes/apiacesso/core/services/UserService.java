package io.github.brfernandes.apiacesso.core.services;

import io.github.brfernandes.apiacesso.core.domain.User;
import io.github.brfernandes.apiacesso.core.ports.UserRepositoryPort;
import io.github.brfernandes.apiacesso.core.ports.UserServicePort;

public class UserService implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        User userExisted = userRepositoryPort.obtainByEmail(user.getEmail());
        if (userExisted != null) {
            throw new IllegalArgumentException("User Already Exits");
        }
        return userRepositoryPort.create(user);
    }
}
