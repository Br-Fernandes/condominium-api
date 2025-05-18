package io.github.brfernandes.apiacesso.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="tb_resident")
public class ResidentEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String cpf;
    private String adress;
    private String phone;
    @OneToOne()
    @JoinColumn(name = "person_id")
    private PersonEntity personEntity;
}
