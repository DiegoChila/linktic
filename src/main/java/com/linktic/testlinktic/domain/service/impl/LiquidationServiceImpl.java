package com.linktic.testlinktic.domain.service.impl;

import com.linktic.testlinktic.domain.dao.BonusDao;
import com.linktic.testlinktic.domain.dao.InsuredPerdonDao;
import com.linktic.testlinktic.domain.dto.InsuredPerson;
import com.linktic.testlinktic.domain.dto.LiquidationResponseDto;
import com.linktic.testlinktic.domain.dto.RequestDto;
import com.linktic.testlinktic.domain.dto.ResponseDto;
import com.linktic.testlinktic.domain.exceptions.CustomHttpException;
import com.linktic.testlinktic.domain.service.LiquidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class LiquidationServiceImpl implements LiquidationService {

    @Autowired
    private InsuredPerdonDao insuredPerdonDao;

    @Autowired
    private BonusDao bonusDao;

    @Override
    public ResponseDto calcLiquidation(RequestDto requestDto) throws CustomHttpException {
        InsuredPerson insuredPerson = insuredPerdonDao.findById(requestDto.getIdDocument())
                .orElseThrow(() -> new CustomHttpException("No existe asegurado con ese id", HttpStatus.NOT_FOUND));

        Period period = Period.between(insuredPerson.getBithday(), LocalDate.now());
        int age = period.getYears();

        List<LiquidationResponseDto> liquidations = bonusDao.findAllByConditions(age)
                .stream()
                .map(b -> new LiquidationResponseDto(b.getProtection().getCode(), b.getProtection().getName(), requestDto.getAmount().multiply(b.getBonus())))
                .toList();

        BigDecimal total = liquidations.stream()
                .map(LiquidationResponseDto::getProtectionAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return new ResponseDto(
                requestDto.getIdType(), requestDto.getIdDocument(), requestDto.getAmount(),
                liquidations, total
        );
    }
}
