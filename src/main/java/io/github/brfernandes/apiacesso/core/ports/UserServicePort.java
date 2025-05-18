package io.github.brfernandes.apiacesso.core.ports;

import io.github.brfernandes.apiacesso.core.domain.User;
import org.springframework.stereotype.Service;

public interface UserServicePort {

    User createUser(User user);
}
