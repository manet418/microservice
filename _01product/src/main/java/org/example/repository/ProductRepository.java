package org.example.repository;

import org.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository //proxy
public interface ProductRepository extends JpaRepository<Product, Long> {

}
