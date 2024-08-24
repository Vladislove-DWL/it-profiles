package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_workers_soft_grades", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"worker_id", "soft_skill_id", "competencion_level_id"})
})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerSoftGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "worker_id", nullable = false)
    private Worker worker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "soft_skill_id", nullable = false)
    private WorkerSoftSkill workerSoftSkill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competencion_level_id", nullable = false)
    private CompetencyLevel competencyLevel;
}
