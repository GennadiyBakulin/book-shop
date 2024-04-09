package ru.book.shop.model;

import java.math.BigDecimal;
import java.util.Date;
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
import ru.book.shop.model.enumeration.Genre;
import ru.book.shop.model.enumeration.Type;

@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "title", length = 100, nullable = false)
  private String title;

  @Column(name = "author", length = 50, nullable = false)
  private String author;

  @Column(name = "screenshot", length = 100)
  private String screenshot;

  @Column(name = "description")
  private String description;

  @Column(name = "year_publication")
  private Date yearPublication;

  @Column(name = "count_page")
  private Integer countPage;

  @Column(name = "weight")
  private Double weight;

  @Column(name = "price", nullable = false)
  private BigDecimal price;

  @Column(name = "count_book", nullable = false)
  private Integer countBook;

  @Column(name = "genre", nullable = false)
  private Genre genre;

  @Column(name = "type", nullable = false)
  private Type type;

}
