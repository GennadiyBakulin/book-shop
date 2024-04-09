package ru.book.shop.model.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Type {

  ELECTRONIC("electronic"), PRINTED("printed");

  private final String type;

}
