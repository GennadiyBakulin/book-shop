package ru.book.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.book.shop.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
