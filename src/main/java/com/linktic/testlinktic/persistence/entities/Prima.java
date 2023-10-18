package com.linktic.testlinktic.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "primas")
public class Prima {

    @Id
    private Long id;

    @Column(name = "edad_minima")
    private Long edadMinima;

    @Column(name = "edad_maxima")
    private Long edadMaxima;

    private BigDecimal prima;

    @ManyToOne
    @JoinColumn(name = "codigo_amparo")
    private Amparo amparo;
}
