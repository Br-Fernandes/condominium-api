package io.github.brfernandes.condominiumapi.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_visitor")
public class VisitorEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String rg;
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity personEntity;
}
