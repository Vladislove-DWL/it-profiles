package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_competencies")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Competency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "competencion_name", nullable = false, length = 50, unique = true)
    private String competencionName;

    @Column(name = "is_hard", nullable = false)
    private Boolean isHard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
