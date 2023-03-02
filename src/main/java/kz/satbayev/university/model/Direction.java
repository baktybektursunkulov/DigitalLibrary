package kz.satbayev.university.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "direction")
@Data
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "is_deleted")
    private Boolean is_deleted;
}
