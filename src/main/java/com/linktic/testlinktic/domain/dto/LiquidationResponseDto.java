package com.linktic.testlinktic.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LiquidationResponseDto {

    @JsonProperty("codigo_amparo")
    private Long protectionCode;

    @JsonProperty("nombre_amparo")
    private String protectionName;

    @JsonProperty("valor_prima")
    private BigDecimal protectionAmount;
}
