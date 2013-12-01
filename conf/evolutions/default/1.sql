# Tasks schema

# --- !Ups

CREATE SEQUENCE task_id_seq;
CREATE TABLE task (
    id integer NOT NULL DEFAULT nextval('task_id_seq'),
    label varchar(255)
);

CREATE TABLE entry (
    id BIGINT(20) NOT NULL AUTO_INCREMENT,
    userId TINYINT(10) NOT NULL,
    content VARCHAR(255) NOT NULL,
    displayFlg TINYINT(10) NOT NULL,
    createdAt DATETIME NOT NULL,
    updatedAt DATETIME,
    PRIMARY KEY (id)
);


# --- !Downs

DROP TABLE task;
DROP SEQUENCE task_id_seq;
DROP TABLE entry;