package ru.book.shop.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.book.shop.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

  Optional<Cart> findByPersonId(Long personId);

}
