package com.example.course.repositories;

import com.example.course.entities.Order;
import com.example.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByClientId(Long client_id);
}
