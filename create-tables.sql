drop table if exists asegurados ;
drop table if exists primas ;
drop table if exists amparos ;


create table asegurados (
	num_identificacion int8,
	tip_identificacion int4 not null,
	apellidos varchar(100) not null,
	nombres varchar(100) not null,
	sexo int4 not null,
	fecha_nacimiento date not null,
	CONSTRAINT asegurados_pkey PRIMARY KEY (num_identificacion)
);

comment on column asegurados.tip_identificacion is '1 - CC; 2 - CE';
comment on column asegurados.sexo is '1 - MASCULINO; 2 - FEMENINO';

create table amparos (
	codigo int8 NOT NULL GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE),
	nombre varchar(100) not null,
	CONSTRAINT amparos_pkey PRIMARY KEY (codigo)
);

create table primas (
	id int8 NOT NULL GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE),
	codigo_amparo int8 not null,
	edad_minima int4 not null,
	edad_maxima int4 not null,
	prima decimal(7,6) not null,
	CONSTRAINT primas_pkey PRIMARY KEY (id),
	CONSTRAINT primas_amparos_fkey FOREIGN KEY (codigo_amparo) REFERENCES amparos(codigo)
);

insert into asegurados(num_identificacion, tip_identificacion, apellidos, nombres, sexo, fecha_nacimiento)
values (79000001, 1, 'APELLIDO1', 'NOMBRE1', 1, '1945-01-10'),
(79000002, 1, 'APELLIDO2', 'NOMBRE2', 1, '1950-01-10'),
(79000003, 1, 'APELLIDO3', 'NOMBRE3', 1, '1955-01-10'),
(51000001, 1, 'APELLIDO4', 'NOMBRE4', 2, '1960-01-10'),
(51000002, 1, 'APELLIDO5', 'NOMBRE5', 2, '1965-01-10'),
(51000003, 1, 'APELLIDO6', 'NOMBRE6', 2, '1970-01-10');

insert into amparos (nombre)
values ('Muerte accidental'),
('Desmembración'),
('Auxilio funerario'),
('Renta vitalicia');

insert into primas (codigo_amparo, edad_minima, edad_maxima, prima)
values (1, 18, 45, 0.02304),
(1, 46, 75, 0.02012),
(2, 18, 50, 0.1809),
(2, 51, 70, 0.16043),
(3, 18, 60, 0.14123),
(3, 61, 70, 0.1545),
(4, 18, 50, 0.12123),
(4, 51, 70, 0.1345);