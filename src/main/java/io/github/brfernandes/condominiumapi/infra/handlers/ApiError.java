package io.github.brfernandes.condominiumapi.infra.handlers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {
    private String message;
}
