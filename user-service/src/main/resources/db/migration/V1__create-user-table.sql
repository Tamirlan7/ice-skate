CREATE TABLE IF NOT EXISTS t_user
(
    id           SERIAL PRIMARY KEY,
    phone_number VARCHAR(10) UNIQUE                  NOT NULL,
    password     VARCHAR(50)                         NOT NULL,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
)
