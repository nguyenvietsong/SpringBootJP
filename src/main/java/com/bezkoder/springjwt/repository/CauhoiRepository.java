package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Cauhoi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CauhoiRepository extends JpaRepository<Cauhoi,Long> {
    Optional<Cauhoi> findById(Long id);
}
