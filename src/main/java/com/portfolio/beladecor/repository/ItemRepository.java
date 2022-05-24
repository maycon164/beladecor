package com.portfolio.beladecor.repository;

import com.portfolio.beladecor.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
