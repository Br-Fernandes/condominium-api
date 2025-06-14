package io.github.brfernandes.condominiumapi.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VisitorDto {

    private Long id;
    private String name;
    private String rg;

}
