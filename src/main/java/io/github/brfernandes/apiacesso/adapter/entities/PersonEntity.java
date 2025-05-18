package io.github.brfernandes.apiacesso.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_person")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
