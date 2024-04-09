package ru.book.shop.model.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

  ROLE_USER("user"), ROLE_ADMIN("admin");

  private final String role;

}
