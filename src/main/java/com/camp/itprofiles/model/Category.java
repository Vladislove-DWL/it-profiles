package com.camp.itprofiles.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_categories")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name", nullable = false, length = 50, unique = true)
    private String categoryName;
}
