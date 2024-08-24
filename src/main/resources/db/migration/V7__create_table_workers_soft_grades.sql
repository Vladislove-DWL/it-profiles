CREATE TABLE IF NOT EXISTS t_workers_soft_grades
(
    id                    BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,

    worker_id             BIGINT REFERENCES t_workers (id)             NOT NULL,
    soft_skill_id         BIGINT REFERENCES t_workers_soft_skills (id) NOT NULL,
    competencion_level_id BIGINT REFERENCES t_competencies_levels (id) NOT NULL,

    UNIQUE (worker_id, soft_skill_id, competencion_level_id)
);