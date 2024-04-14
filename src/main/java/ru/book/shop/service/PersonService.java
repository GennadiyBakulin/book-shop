package ru.book.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.book.shop.repository.PersonRepository;

@Service
@RequiredArgsConstructor
public class PersonService {

  private final PersonRepository personRepository;

}
