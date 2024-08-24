package com.camp.itprofiles.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_competencies_levels")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompetencyLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "level", nullable = false, unique = true)
    private Integer level;
}
