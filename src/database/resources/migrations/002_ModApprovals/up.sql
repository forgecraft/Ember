CREATE TABLE IF NOT EXISTS approval_queue (
    message_id BIGINT NOT NULL PRIMARY KEY,
    mod_file_id INTEGER UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY (mod_file_id) REFERENCES mod_files (id) ON DELETE CASCADE ON UPDATE CASCADE
);
