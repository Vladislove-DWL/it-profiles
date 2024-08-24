package com.camp.itprofiles.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_workers_hard_grades",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"worker_id", "hard_skill_id", "competencion_theory_level_id"}),
        @UniqueConstraint(columnNames = {"worker_id", "hard_skill_id", "competencion_practical_level_id"})
})
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerHardGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "worker_id", nullable = false)
    private Worker worker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hard_skill_id", nullable = false)
    private WorkerHardSkill hardSkill;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competencion_theory_level_id", nullable = false)
    private CompetencyLevel theoryLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "competencion_practical_level_id", nullable = false)
    private CompetencyLevel practicalLevel;

}
