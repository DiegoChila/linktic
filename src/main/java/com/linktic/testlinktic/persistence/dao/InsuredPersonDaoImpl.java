package com.linktic.testlinktic.persistence.dao;

import com.linktic.testlinktic.domain.dao.InsuredPerdonDao;
import com.linktic.testlinktic.domain.dto.InsuredPerson;
import com.linktic.testlinktic.persistence.jpa.AseguradoJpa;
import com.linktic.testlinktic.persistence.mappers.AseguradoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class InsuredPersonDaoImpl implements InsuredPerdonDao {

    @Autowired
    private AseguradoJpa aseguradoJpa;

    @Autowired
    private AseguradoMapper aseguradoMapper;

    @Override
    public Optional<InsuredPerson> findById(Long id) {
        return aseguradoJpa.findById(id)
                .map(a -> aseguradoMapper.toInsuredPerson(a));
    }
}
