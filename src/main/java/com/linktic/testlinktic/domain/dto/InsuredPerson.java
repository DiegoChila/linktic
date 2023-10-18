package com.linktic.testlinktic.domain.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class InsuredPerson {

    private Long idNumber;

    private Integer idType;

    private String lastname;

    private String name;

    private Integer gender;

    private LocalDate bithday;
}
