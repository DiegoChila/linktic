package com.linktic.testlinktic.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    @JsonProperty("tipo_identificacion")
    private Integer idType;

    @JsonProperty("nro_identificacion")
    private Long idDocument;

    @JsonProperty("valor_asegurado")
    private BigDecimal amount;

    @JsonProperty("liquidacion")
    private List<LiquidationResponseDto> liquidations;

    @JsonProperty("valor_total")
    private BigDecimal totalAmount;
}
