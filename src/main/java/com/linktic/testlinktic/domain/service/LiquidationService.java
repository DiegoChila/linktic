package com.linktic.testlinktic.domain.service;

import com.linktic.testlinktic.domain.dto.RequestDto;
import com.linktic.testlinktic.domain.dto.ResponseDto;
import com.linktic.testlinktic.domain.exceptions.CustomHttpException;

public interface LiquidationService {

    ResponseDto calcLiquidation(RequestDto requestDto) throws CustomHttpException;
}


