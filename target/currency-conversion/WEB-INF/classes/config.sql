CREATE TABLE currencies (
    id SERIAL PRIMARY KEY,
    code VARCHAR(3) UNIQUE ,
    full_name VARCHAR,
    sign VARCHAR(16)
);

CREATE TABLE exchange_rates (
    id SERIAL PRIMARY KEY,
    base_currency_id INTEGER,
    target_currency_id INTEGER,
    rate DECIMAL(6),

    FOREIGN KEY (base_currency_id) REFERENCES currencies(id),
    FOREIGN KEY (target_currency_id) REFERENCES currencies(id)
);