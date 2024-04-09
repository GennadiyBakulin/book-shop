package ru.book.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.book.shop.model.Favourites;

@Repository
public interface FavouritesRepository extends JpaRepository<Favourites, Long> {

}
