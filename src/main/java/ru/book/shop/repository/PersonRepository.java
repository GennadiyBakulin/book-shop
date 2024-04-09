package ru.book.shop.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.book.shop.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

  Optional<Person> findByEmail(String email);

}
