package io.github.brfernandes.condominiumapi.adapter.repositories;

import io.github.brfernandes.condominiumapi.adapter.entities.VisitorEntity;
import io.github.brfernandes.condominiumapi.core.domain.Visitor;
import io.github.brfernandes.condominiumapi.core.ports.VisitorRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VisitorRepositoryAdapter implements VisitorRepositoryPort {

    private final VisitorRepository visitorRepository;
    private final PersonRepositoryAdapter personRepository;
    private final ModelMapper modelMapper;

    @Override
    public Visitor create(Visitor visitor) {
        VisitorEntity entity = modelMapper.map(visitor, VisitorEntity.class);
        entity.setPersonEntity(personRepository.createPerson(visitor.getPerson()));
        return modelMapper.map(visitorRepository.save(entity), Visitor.class);
    }

    @Override
    public Optional<Visitor> obtainByRg(String rg) {
        return visitorRepository.findByRg(rg)
                .map(visitorEntity -> modelMapper.map(visitorEntity, Visitor.class));
    }

    @Override
    public Collection<Visitor> listAll() {
        return visitorRepository.findAll().stream()
                .map(visitorEntity -> modelMapper.map(visitorEntity, Visitor.class))
                .toList();
    }
}
