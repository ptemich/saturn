
    create table document (
        id uuid not null,
        name varchar(255),
        primary key (id)
    );

    create table document_linking (
        document_id uuid,
        id uuid not null,
        task_id uuid,
        text varchar(255),
        primary key (id)
    );

    create table process (
        id uuid not null,
        workstream_id uuid,
        name varchar(255),
        primary key (id)
    );

    create table project (
        id uuid not null,
        name varchar(255),
        primary key (id)
    );

    create table task (
        id uuid not null,
        process_id uuid,
        name varchar(255),
        primary key (id)
    );

    create table workstream (
        id uuid not null,
        project_id uuid,
        name varchar(255),
        primary key (id)
    );

    alter table if exists document_linking 
       add constraint FK5yqibpve1brhomgiou5q4fb6j 
       foreign key (document_id) 
       references document;

    alter table if exists document_linking 
       add constraint FKc0dd7qh95ecpflf40nqyrcf2i 
       foreign key (task_id) 
       references task;

    alter table if exists process 
       add constraint FK9iw6fx32hp06wjotbyrk5qpoj 
       foreign key (workstream_id) 
       references workstream;

    alter table if exists task 
       add constraint FK7uhy201g39igukqqi6ue4868u 
       foreign key (process_id) 
       references process;

    alter table if exists workstream 
       add constraint FKpv92x4xd1ikgmaqoa6tp8mqkm 
       foreign key (project_id) 
       references project;
