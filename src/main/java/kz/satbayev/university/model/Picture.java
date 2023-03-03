package kz.satbayev.university.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "picture")
@Data
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url_minio")
    private String url_minio;

    @Column(name = "books_id")
    private Long books_id;


    @Column(name = "is_deleted")
    private Boolean is_deleted;
}
