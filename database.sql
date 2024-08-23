CREATE TABLE wikidata_changes (
                                  id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                  change_id BIGINT,
                                  type VARCHAR(255),
                                  namespace INT,
                                  title VARCHAR(255),
                                  comment TEXT,
                                  timestamp BIGINT,
                                  user VARCHAR(255),
                                  bot BOOLEAN,
                                  minor BOOLEAN,
                                  old_revision BIGINT,
                                  new_revision BIGINT
);
