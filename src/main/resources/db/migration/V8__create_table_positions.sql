CREATE TABLE IF NOT EXISTS t_positions
(
    id    BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    position_name VARCHAR(50) NOT NULL UNIQUE
);