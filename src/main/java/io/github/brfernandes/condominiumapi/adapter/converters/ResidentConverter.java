package io.github.brfernandes.condominiumapi.adapter.converters;

import io.github.brfernandes.condominiumapi.adapter.dtos.ResidentDto;
import io.github.brfernandes.condominiumapi.core.domain.Person;
import io.github.brfernandes.condominiumapi.core.domain.Resident;
import org.springframework.stereotype.Component;

@Component
public class ResidentConverter {

    public Resident toDomain(ResidentDto residentDto) {
        return new Resident(
                residentDto.getId(),
                residentDto.getCpf(),
                residentDto.getAdress(),
                residentDto.getPhone(),
                new Person(null, residentDto.getName())
        );
    }

    public ResidentDto toDto(Resident resident) {
        return new ResidentDto(
                resident.getId(),
                resident.getPerson().getName(),
                resident.getCpf(),
                resident.getAdress(),
                resident.getPhone()
        );
    }
}
