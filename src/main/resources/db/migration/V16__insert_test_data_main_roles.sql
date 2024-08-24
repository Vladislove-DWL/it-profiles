TRUNCATE t_hard_roles RESTART IDENTITY CASCADE;

INSERT INTO t_hard_roles (role_name)
VALUES ('Аналитик'),
       ('Прикладной администратор'),
       ('Тестировщик'),
       ('Backend Разработчик'),
       ('Frontend Разработчик');

TRUNCATE t_hard_specializations RESTART IDENTITY CASCADE;

INSERT INTO t_hard_specializations (specialization_name, role_id)
VALUES ('Системный аналитик', 1),
       ('Бизнес аналитик', 1),
       ('DevOps (CI/CD engineer)',2),
       ('QA engineer',3),
       ('Auto QA engineer',3),
       ('Разработчик на Java',4),
       ('Разработчик на Python',4),
       ('Standart-Frontend',5);