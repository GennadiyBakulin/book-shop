package ru.book.shop.model.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Genre {

  DRAMA("drama"), COMEDY("comedy"), FANTASTIC("fantastic");

  private final String genre;

}
