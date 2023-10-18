package com.linktic.testlinktic.persistence.dao;

import com.linktic.testlinktic.domain.dao.BonusDao;
import com.linktic.testlinktic.domain.dto.Bonus;
import com.linktic.testlinktic.persistence.jpa.PrimaJpa;
import com.linktic.testlinktic.persistence.mappers.PrimaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BonusDaoImpl implements BonusDao {

    @Autowired
    private PrimaJpa primaJpa;

    @Autowired
    private PrimaMapper primaMapper;

    @Override
    public List<Bonus> findAllByConditions(int age) {
        return primaMapper.toBonusList(
                primaJpa.findAllByConditions(age)
        );
    }
}
