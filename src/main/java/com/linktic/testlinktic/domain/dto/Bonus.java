package com.linktic.testlinktic.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bonus {

    private Long id;

    private Long minAge;

    private Long maxAge;

    private BigDecimal bonus;

    private Protection protection;
}
