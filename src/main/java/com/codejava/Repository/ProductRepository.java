package com.codejava.Repository;

import com.codejava.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product , Long> {
}
