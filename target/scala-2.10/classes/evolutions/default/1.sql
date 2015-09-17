# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table grupo (
  id                        bigint auto_increment not null,
  nombre                    varchar(255),
  descripcion               varchar(255),
  constraint uq_grupo_nombre unique (nombre),
  constraint pk_grupo primary key (id))
;

create table rol (
  id                        bigint auto_increment not null,
  nombre                    varchar(255),
  descripcion               varchar(255),
  constraint uq_rol_nombre unique (nombre),
  constraint pk_rol primary key (id))
;

create table usuario (
  id                        bigint auto_increment not null,
  user_name                 varchar(255),
  password                  varchar(255),
  nombre                    varchar(255),
  a_paterno                 varchar(255),
  a_materno                 varchar(255),
  email                     varchar(255),
  rol_id                    bigint,
  grupo_id                  bigint,
  constraint uq_usuario_user_name unique (user_name),
  constraint pk_usuario primary key (id))
;

alter table usuario add constraint fk_usuario_rol_1 foreign key (rol_id) references rol (id) on delete restrict on update restrict;
create index ix_usuario_rol_1 on usuario (rol_id);
alter table usuario add constraint fk_usuario_grupo_2 foreign key (grupo_id) references grupo (id) on delete restrict on update restrict;
create index ix_usuario_grupo_2 on usuario (grupo_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table grupo;

drop table rol;

drop table usuario;

SET FOREIGN_KEY_CHECKS=1;

