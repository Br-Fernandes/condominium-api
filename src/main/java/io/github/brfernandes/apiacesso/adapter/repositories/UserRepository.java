package io.github.brfernandes.apiacesso.adapter.repositories;

import io.github.brfernandes.apiacesso.adapter.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
}
