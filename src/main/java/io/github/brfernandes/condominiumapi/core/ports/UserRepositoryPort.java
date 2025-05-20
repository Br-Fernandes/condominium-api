package io.github.brfernandes.condominiumapi.core.ports;

import io.github.brfernandes.condominiumapi.core.domain.User;

public interface UserRepositoryPort {

    public User create(User user);

    public User obtainByEmail(String email);
}
