package com.linktic.testlinktic.web.controllers;

import com.linktic.testlinktic.domain.dto.RequestDto;
import com.linktic.testlinktic.domain.dto.ResponseDto;
import com.linktic.testlinktic.domain.exceptions.CustomHttpException;
import com.linktic.testlinktic.domain.service.LiquidationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/liquidation")
public class LiquidationController {

    @Autowired
    private LiquidationService liquidationService;

    @PostMapping
    public ResponseEntity<ResponseDto> calcLiquidation(@RequestBody @Valid RequestDto requestDto) throws CustomHttpException {
        return ResponseEntity.ok(liquidationService.calcLiquidation(requestDto));
    }
}
