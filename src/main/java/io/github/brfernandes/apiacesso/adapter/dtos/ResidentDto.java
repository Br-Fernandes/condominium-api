package io.github.brfernandes.apiacesso.adapter.dtos;

import io.github.brfernandes.apiacesso.core.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResidentDto {

    private Long id;
    private String name;
    private String cpf;
    private String adress;
    private String phone;
}
