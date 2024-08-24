package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_specializations_competencies", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"specialization_id", "competencion_id"})
})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecializationCompetency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialization_id", nullable = false)
    private HardSpecialization hardSpecialization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competencion_id", nullable = false)
    private Competency competency;

}
