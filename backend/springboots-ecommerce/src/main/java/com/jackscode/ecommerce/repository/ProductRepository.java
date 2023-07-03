package com.jackscode.ecommerce.repository;

import com.jackscode.ecommerce.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    // findByCategory behind scenes execute:
    // SQL query: SELECT * FROM product where category_id = ?
    // Spring Data REST automatically express endpoint:
    // http://localhost:8080/api/products/search/findByCategoryId?id=2
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    // findByNameContaining behind scenes execute:
    // SQL query: SELECT * FROM product p WHERE p.name LIKE CONCAT('%', :name, '%')
    // Spring Data REST automatically express endpoint:
    // http://localhost:8080/api/products/search/findByNameContaining?name=Python
    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}
