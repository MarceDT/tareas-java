CREATE TABLE Especialidad (
  codigo_especialidad INT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  asignaturas_totales INT,
  titulo_oficial VARCHAR(100)
);

CREATE TABLE Curso (
  numero_curso VARCHAR(5) PRIMARY KEY,
  asignaturas_curso VARCHAR(200)
);

CREATE TABLE Grupo (
  id_grupo INT PRIMARY KEY AUTO_INCREMENT,
  codigo_especialidad INT,
  numero_curso VARCHAR(5),
  codigo_grupo VARCHAR(1),
  numero_alumnos INT,
  tutor_dni VARCHAR(10),
  FOREIGN KEY (codigo_especialidad) REFERENCES Especialidad(codigo_especialidad),
  FOREIGN KEY (numero_curso) REFERENCES Curso(numero_curso),
  FOREIGN KEY (tutor_dni) REFERENCES Profesor(dni)
);

CREATE TABLE Profesor (
  dni VARCHAR(10) PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  apellidos VARCHAR(100) NOT NULL,
  domicilio VARCHAR(200),
  nivel_estudios VARCHAR(100),
  titulacion VARCHAR(100)
);

CREATE TABLE Clase (
  id_clase INT PRIMARY KEY AUTO_INCREMENT,
  id_grupo INT,
  dni_profesor VARCHAR(10),
  fecha DATE,
  hora_inicio TIME,
  hora_fin TIME,
  FOREIGN KEY (id_grupo) REFERENCES Grupo(id_grupo),
  FOREIGN KEY (dni_profesor) REFERENCES Profesor(dni)
);

CREATE TABLE FichaIndividual (
  id_ficha INT PRIMARY KEY AUTO_INCREMENT,
  dni_alumno VARCHAR(10),
  id_clase INT,
  mes INT,
  dia INT,
  clase VARCHAR(100),
  firma_profesor VARCHAR(100),
  FOREIGN KEY (dni_alumno) REFERENCES Alumno(dni),
  FOREIGN KEY (id_clase) REFERENCES Clase(id_clase)
);

CREATE TABLE Candidato (
  dni VARCHAR(10) PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  apellidos VARCHAR(100) NOT NULL,
  domicilio VARCHAR(200),
  nivel_estudios VARCHAR(100),
  titulacion VARCHAR(100),
  materias_impartir VARCHAR(200),
  desea_tutor INT,
  desea_especialista INT
);

CREATE TABLE Entrevista (
  id_entrevista INT PRIMARY KEY AUTO_INCREMENT,
  dni_candidato VARCHAR(10),
  fecha_hora DATETIME,
  disposicion VARCHAR(100),
  valoracion VARCHAR(200),
  FOREIGN KEY (dni_candidato) REFERENCES Candidato(dni)
);

CREATE TABLE ComiteSelectivo (
  id_comite INT PRIMARY KEY AUTO_INCREMENT,
  presidente VARCHAR(100),
  secretario VARCHAR(100),
  vocal VARCHAR(100),
  anio_constitucion INT
);
