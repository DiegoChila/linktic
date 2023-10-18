package com.linktic.testlinktic.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "asegurados")
public class Asegurado {

    @Id
    @Column(name = "num_identificacion")
    private Long numIdentificacion;

    @Column(name = "tip_identificacion")
    private Integer tipIdentificacion;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "sexo")
    private Integer sexo;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
}
