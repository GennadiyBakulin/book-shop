package ru.book.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.book.shop.repository.BookRepository;

@Service
@RequiredArgsConstructor
public class BookService {

  private final BookRepository bookRepository;

}
