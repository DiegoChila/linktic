package com.linktic.testlinktic.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "amparos")
public class Amparo {

    @Id
    private Long codigo;

    private String nombre;
}
