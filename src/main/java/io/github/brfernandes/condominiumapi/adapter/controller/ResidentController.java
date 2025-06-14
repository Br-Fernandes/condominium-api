package io.github.brfernandes.condominiumapi.adapter.controller;

import io.github.brfernandes.condominiumapi.adapter.converters.ResidentConverter;
import io.github.brfernandes.condominiumapi.adapter.dtos.ResidentDto;
import io.github.brfernandes.condominiumapi.core.domain.Resident;
import io.github.brfernandes.condominiumapi.core.ports.ResidentServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/residents")
public class ResidentController {

    private final ResidentServicePort residentServicePort;
    private final ResidentConverter residentConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResidentDto create(@RequestBody ResidentDto residentDto) {
        Resident newResident = residentServicePort.createResident(residentConverter.toDomain(residentDto));
        return residentConverter.toDto(newResident);
    }

    @GetMapping
    public Collection<ResidentDto> findAll(){
        return residentServicePort.findAll()
                .stream()
                .map(residentConverter::toDto)
                .toList();
    }
}
