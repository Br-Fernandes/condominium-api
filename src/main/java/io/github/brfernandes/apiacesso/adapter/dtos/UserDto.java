package io.github.brfernandes.apiacesso.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Boolean admin;

}
