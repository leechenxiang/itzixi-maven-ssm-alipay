drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   varchar(20) not null,
   username             varchar(128),
   sex                  varchar(20),
   primary key (id)
);

alter table user comment '用户表';
