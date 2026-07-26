CREATE TABLE IF NOT EXISTS t_ticket
(
    id                SERIAL PRIMARY KEY,
    user_id           INTEGER                             NOT NULL,
    season_id         INTEGER                             NOT NULl,
    payment_id        INTEGER                             NOT NULL,
    adults_quantity   INTEGER   DEFAULT 0                 NOT NULL,
    students_quantity INTEGER   DEFAULT 0                 NOT NULL,
    children_quantity INTEGER   DEFAULT 0                 NOT NULL,
    created_at        TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
)
