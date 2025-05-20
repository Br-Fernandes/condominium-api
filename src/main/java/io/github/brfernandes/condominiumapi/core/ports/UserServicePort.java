package io.github.brfernandes.condominiumapi.core.ports;

import io.github.brfernandes.condominiumapi.core.domain.User;

public interface UserServicePort {

    User createUser(User user);
}
