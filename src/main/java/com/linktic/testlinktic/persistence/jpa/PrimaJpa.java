package com.linktic.testlinktic.persistence.jpa;

import com.linktic.testlinktic.persistence.entities.Prima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PrimaJpa extends JpaRepository<Prima, Long> {

    @Query(value = "select p " +
            "from Prima p  " +
            "where :age between p.edadMinima and p.edadMaxima")
    List<Prima> findAllByConditions(
            @Param("age") Integer age
    );
}
