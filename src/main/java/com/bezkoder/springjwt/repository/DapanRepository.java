package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Dapan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DapanRepository extends JpaRepository<Dapan,Long> {
    Optional<Dapan> findById(Long id);
}
