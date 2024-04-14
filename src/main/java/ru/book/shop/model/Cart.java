package ru.book.shop.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "count", nullable = false)
  private Integer count;

  @Column(name = "amount", nullable = false)
  private BigDecimal amount;

  @Column(name = "status")
  private Boolean status;

  @Column(name = "book_id")
  private Long bookId;

  @Column(name = "person_id")
  private Long personId;

  @Column(name = "datetime", nullable = false)
  private Date dateTime;

  @ManyToOne
  @JoinColumn(name = "person_id", referencedColumnName = "id")
  private Person person;

  @ManyToOne
  @JoinColumn(name = "book_id")
  private Book book;

}
