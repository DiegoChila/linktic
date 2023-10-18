package com.linktic.testlinktic.domain.dao;

import com.linktic.testlinktic.domain.dto.Bonus;

import java.util.List;

public interface BonusDao {

    List<Bonus> findAllByConditions(int age);
}
