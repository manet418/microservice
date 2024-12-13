package org.example.repository;

import org.example.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

    Discount findByCodeName(String codeName);
}
