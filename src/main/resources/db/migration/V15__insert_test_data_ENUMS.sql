TRUNCATE t_competencies_levels RESTART IDENTITY CASCADE;

INSERT INTO t_competencies_levels (level)
VALUES (-1),
       (0),
       (1),
       (2),
       (3);

TRUNCATE t_system_levels RESTART IDENTITY CASCADE;

INSERT INTO t_system_levels (system_level_name)
VALUES ('USER'),
       ('ADMIN');

TRUNCATE t_positions RESTART IDENTITY CASCADE;

INSERT INTO t_positions (position_name)
VALUES ('Сотрудник'),
       ('Руководитель подразделения'),
       ('Руководитель отдела'),
       ('Главный разработчик'),
       ('Главный аналитик'),
       ('Директор');