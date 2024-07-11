CREATE TABLE usuarios(
    id bigint NOT NULL auto_increment,
    login VARCHAR(100) NOT NULL,
    password VARCHAR(255) not null,

    primary key(id)
)