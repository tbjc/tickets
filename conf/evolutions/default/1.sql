# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table departamento (
  id                        bigint auto_increment not null,
  nombre                    varchar(255),
  constraint pk_departamento primary key (id))
;

create table distrito (
  id                        bigint auto_increment not null,
  distrito                  varchar(255),
  constraint pk_distrito primary key (id))
;

create table empleado (
  id                        bigint auto_increment not null,
  nombre                    varchar(255),
  nom_usuario               varchar(255),
  password                  varchar(255),
  departamento_id           bigint,
  constraint pk_empleado primary key (id))
;

alter table empleado add constraint fk_empleado_departamento_1 foreign key (departamento_id) references departamento (id) on delete restrict on update restrict;
create index ix_empleado_departamento_1 on empleado (departamento_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table departamento;

drop table distrito;

drop table empleado;

SET FOREIGN_KEY_CHECKS=1;

