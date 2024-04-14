package ru.book.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.book.shop.repository.CommentRepository;

@Service
@RequiredArgsConstructor
public class CommentService {

  private final CommentRepository commentRepository;

}
