package io.github.brfernandes.apiacesso.adapter.repositories;

import io.github.brfernandes.apiacesso.adapter.entities.VisitorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitorRepository extends JpaRepository<VisitorEntity, Long> {

    Optional<VisitorEntity> findByRg(String rg);
}
