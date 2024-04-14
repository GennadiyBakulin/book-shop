package ru.book.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.book.shop.repository.CartRepository;

@Service
@RequiredArgsConstructor
public class CartService {

  private final CartRepository cartRepository;

}
