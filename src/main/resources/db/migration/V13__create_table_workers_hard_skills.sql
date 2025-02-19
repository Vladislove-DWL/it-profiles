CREATE TABLE IF NOT EXISTS t_workers_hard_skills
(
    id                 BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,

    t_shape_profile_id BIGINT REFERENCES t_t_shape_profiles (id)             NOT NULL,
    specialization_competencion_id       BIGINT REFERENCES t_specializations_competencies (id) NOT NULL,

    UNIQUE (t_shape_profile_id, specialization_competencion_id)
);