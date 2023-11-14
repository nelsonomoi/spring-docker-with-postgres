create table if not exists t_persons(
    id integer generated always as identity,
    name varchar(100)
);