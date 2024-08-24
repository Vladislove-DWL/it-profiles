package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_workers_hard_skills", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"t_shape_profile_id", "specialization_competencion_id"})
})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerHardSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "t_shape_profile_id", nullable = false)
    private TShapeProfile tShapeProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialization_competencion_id", nullable = false)
    private SpecializationCompetency specializationCompetency;

}
