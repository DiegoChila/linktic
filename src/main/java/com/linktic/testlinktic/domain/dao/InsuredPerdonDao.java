package com.linktic.testlinktic.domain.dao;

import com.linktic.testlinktic.domain.dto.InsuredPerson;

import java.util.Optional;

public interface InsuredPerdonDao {

    Optional<InsuredPerson> findById(Long id);
}
