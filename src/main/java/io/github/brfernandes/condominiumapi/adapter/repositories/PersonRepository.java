package io.github.brfernandes.condominiumapi.adapter.repositories;

import io.github.brfernandes.condominiumapi.adapter.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
