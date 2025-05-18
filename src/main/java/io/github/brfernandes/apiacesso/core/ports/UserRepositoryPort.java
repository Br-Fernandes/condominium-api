package io.github.brfernandes.apiacesso.core.ports;

import io.github.brfernandes.apiacesso.core.domain.User;

public interface UserRepositoryPort {

    public User create(User user);

    public User obtainByEmail(String email);
}
