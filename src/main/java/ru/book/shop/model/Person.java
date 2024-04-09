package ru.book.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.book.shop.model.enumeration.Role;

@Entity
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name", length = 50, nullable = false)
  private String name;

  @Column(name = "last_name", length = 50, nullable = false)
  private String lastName;

  @Column(name = "password", length = 50, nullable = false)
  private String password;

  @Column(name = "email", length = 50, nullable = false, unique = true)
  private String email;

  @Column(name = "phone", length = 12)
  private String phone;

  @Column(name = "role", length = 10, nullable = false)
  private Role role;

}
