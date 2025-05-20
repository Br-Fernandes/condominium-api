package io.github.brfernandes.condominiumapi.adapter.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="tb_user")
public class UserEntity {


    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private Boolean admin;
    @OneToOne
    @JoinColumn(name= "person_id")
    private PersonEntity personEntity;


}
