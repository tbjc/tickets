# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table usuario (
  id                        bigint auto_increment not null,
  user_name                 varchar(255),
  nombre_completo           varchar(255),
  password                  varchar(255),
  pregunta_secreta          varchar(255),
  respuesta_secreta         varchar(255),
  perfil                    varchar(255),
  email                     varchar(255),
  constraint uq_usuario_user_name unique (user_name),
  constraint pk_usuario primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table usuario;

SET FOREIGN_KEY_CHECKS=1;

