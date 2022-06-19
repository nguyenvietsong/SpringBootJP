package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.TrinhDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrindoRepository extends JpaRepository<TrinhDo,Long> {
      TrinhDo findByName(String name);
      Optional<TrinhDo> findById(Long id);
}
