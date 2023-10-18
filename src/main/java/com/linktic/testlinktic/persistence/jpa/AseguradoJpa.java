package com.linktic.testlinktic.persistence.jpa;

import com.linktic.testlinktic.persistence.entities.Asegurado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AseguradoJpa extends JpaRepository<Asegurado, Long> {
}
