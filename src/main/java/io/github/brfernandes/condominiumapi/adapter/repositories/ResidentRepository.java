package io.github.brfernandes.condominiumapi.adapter.repositories;

import io.github.brfernandes.condominiumapi.adapter.entities.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<ResidentEntity, Long> {

    ResidentEntity findByCpf(String cpf);
}
