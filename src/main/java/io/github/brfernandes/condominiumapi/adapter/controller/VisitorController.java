package io.github.brfernandes.condominiumapi.adapter.controller;

import io.github.brfernandes.condominiumapi.adapter.converters.VisitorConverter;
import io.github.brfernandes.condominiumapi.adapter.dtos.VisitorDto;
import io.github.brfernandes.condominiumapi.core.domain.Visitor;
import io.github.brfernandes.condominiumapi.core.ports.VisitorServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/visitors")
public class VisitorController {

    private final VisitorServicePort visitorServicePort;
    private final VisitorConverter visitorConverter;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitorDto create(@RequestBody VisitorDto visitorDto) {
        Visitor newVisitor = visitorServicePort.createVisitor(visitorConverter.toDomain(visitorDto));
        return visitorConverter.toDto(newVisitor);
    }

    @GetMapping
    public List<VisitorDto> listAll() {
         return visitorServicePort.listAll().stream()
                 .map(visitorConverter::toDto)
                 .collect(Collectors.toList());
    }

    @GetMapping("/{rg}")
    public VisitorDto obtainByRg(@PathVariable String rg) {
        return visitorConverter.toDto(visitorServicePort.obtainByRg(rg));
    }
}
