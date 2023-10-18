package com.linktic.testlinktic.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RequestDto {

    @JsonProperty("tipo_identificacion")
    @NotNull(message = "El campo tipo_identificacion es obligatorio")
    private Integer idType;

    @JsonProperty("nro_identificacion")
    @NotNull(message = "El campo nro_identificacion es obligatorio")
    private Long idDocument;

    @JsonProperty("valor_asegurado")
    @NotNull(message = "El campo valor_asegurado es obligatorio")
    private BigDecimal amount;
}
