package com.codejava.Repository;

import com.codejava.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product , Long> {
    @Query("SELECT p from Product p where p.name LIKE %?1%")
    public List<Product> findAll(String keyword);
}
