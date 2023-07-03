package com.jackscode.ecommerce.repository;

import com.jackscode.ecommerce.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {

    // SELECT * FROM orders
    // LEFT OUTER JOIN customer
    // ON order.customer_id = customer.id
    // WHERE customer.email = :email
    // ORDER BY orders.date created DESC
    Page<Order> findByCustomerEmailOrderByDateCreatedDesc(@Param("email") String email, Pageable pageable);
}
