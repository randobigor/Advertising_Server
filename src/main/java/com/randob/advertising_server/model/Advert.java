package com.randob.advertising_server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "adverts")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Advert {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  @ManyToOne
  @JoinColumn(name = "region_id")
  private Region region;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "price")
  private Float price;

  @Column(name = "publication_date")
  private Timestamp publicationDate;

  @LazyCollection(LazyCollectionOption.FALSE)
  @ManyToMany
  @JoinTable(
      name = "pictures_to_adverts",
      joinColumns = @JoinColumn(name = "advert_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "picture_id", referencedColumnName = "id")
  )
  private List<Picture> pictures;
}
