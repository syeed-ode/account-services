create table `users` (
    id int not null,
    uuid varchar(40) not null,
    name varchar(100),
    external_id varchar(40) not null,
    primary key (ID)
);

create unique index UUID_IDX on PARTNER (UUID) using HASH;