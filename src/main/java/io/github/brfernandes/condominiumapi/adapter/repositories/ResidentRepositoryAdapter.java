package io.github.brfernandes.condominiumapi.adapter.repositories;

import io.github.brfernandes.condominiumapi.adapter.entities.ResidentEntity;
import io.github.brfernandes.condominiumapi.core.domain.Resident;
import io.github.brfernandes.condominiumapi.core.ports.ResidentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ResidentRepositoryAdapter implements ResidentRepositoryPort {

    private final ResidentRepository residentRepository;
    private final PersonRepositoryAdapter personRepository;
    private final ModelMapper modelMapper;

    @Override
    public Resident createResident(Resident resident) {
        ResidentEntity entity = modelMapper.map(resident, ResidentEntity.class);
        entity.setPersonEntity(personRepository.createPerson(resident.getPerson()));
        ResidentEntity newResident = residentRepository.save(entity);
        return modelMapper.map(newResident, Resident.class);
    }


    @Override
    public Resident obtainByCpf(String cpf) {
        ResidentEntity residentCpf = residentRepository.findByCpf(cpf);
        if (residentCpf == null) {
            return null;
        }

        return modelMapper.map(residentCpf, Resident.class);
    }
}
