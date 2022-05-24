package com.portfolio.beladecor.repository;

import com.portfolio.beladecor.model.Kit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitRepository extends JpaRepository <Kit, Long> {
}
