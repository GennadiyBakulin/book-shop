package ru.book.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.book.shop.repository.FavouritesRepository;

@Service
@RequiredArgsConstructor
public class FavouritesService {

  private final FavouritesRepository favouritesRepository;

}
