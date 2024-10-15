
    create table process (
        id uuid not null,
        name varchar(255),
        primary key (id)
    );

    create table project (
        id uuid not null,
        name varchar(255),
        primary key (id)
    );

    create table workstream (
        id uuid not null,
        name varchar(255),
        primary key (id)
    );
