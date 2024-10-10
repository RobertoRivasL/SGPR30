-- Capacitaciones

-- Insert 1
INSERT INTO Capacitacion (rut_Cliente, dia, hora, lugar, duracion, cantidad_Asistentes)
VALUES ('123456789', 'Miércoles', '09:00', 'Sala A', '2 horas', '20');
-- Insert 2
INSERT INTO Capacitacion (rut_Cliente, dia, hora, lugar, duracion, cantidad_Asistentes)
VALUES ('987654321', 'Martes', '14:00', 'Sala B', '3 horas', '15');

-- Insert 3
INSERT INTO Capacitacion (rut_Cliente, dia, hora, lugar, duracion, cantidad_Asistentes)
VALUES ('543216789', 'Jueves', '10:30', 'Sala C', '1.5 horas', '10');

-- Insert 4
INSERT INTO Capacitacion (rut_Cliente, dia, hora, lugar, duracion, cantidad_Asistentes)
VALUES ('987612345', 'Sábado', '16:00', 'Sala D', '2.5 horas', '25');

-- Insert 5
INSERT INTO Capacitacion (rut_Cliente, dia, hora, lugar, duracion, cantidad_Asistentes)
VALUES ('654321987', 'Domingo', '11:00', 'Sala E', '2 horas', '18');

-- Usuarios

-- Insert 1
INSERT INTO usuario (username, password)
VALUES ('admin', '123');

-- Insert 2

INSERT INTO usuario (username, password)
VALUES ('patricio', '123');

-- Insert 3

INSERT INTO usuario (username, password)
VALUES ('ivan', '123');

-- Authorities

INSERT INTO autorities (name)
VALUES ('CLIENTE');
INSERT INTO autorities (name)
VALUES ('PROFESIONAL');
INSERT INTO autorities (name)
VALUES ('ADMINISTRATIVO');

INSERT INTO usuario_authority (username, authority_id)
values ('ivan', 1);
INSERT INTO usuario_authority (username, authority_id)
values ('patricio', 2);
INSERT INTO usuario_authority (username, authority_id)
values ('admin', 3);


-- Pagos

INSERT INTO pagos (monto, fecha_Pago)
VALUES ('400000', '2023-12-10');

INSERT INTO pagos (monto, fecha_Pago)
VALUES ('600000', '2023-06-05');

INSERT INTO pagos (monto, fecha_Pago)
VALUES ('800000', '2023-11-07');

INSERT INTO pagos (monto, fecha_Pago)
VALUES ('100000', '2023-03-03');

-- Visitas

INSERT INTO visitas (fecha_visita, nombre_visita, detalle)
VALUES ('2023-01-05', 'ivan', 'a');

INSERT INTO visitas (fecha_visita, nombre_visita, detalle)
VALUES ('2023-03-06', 'bastian', 'b');

INSERT INTO visitas (fecha_visita, nombre_visita, detalle)
VALUES ('2023-09-07', 'patricio', 'c');

INSERT INTO visitas (fecha_visita, nombre_visita, detalle)
VALUES ('2023-07-08', 'roberto', 'd');

INSERT INTO visitas (fecha_visita, nombre_visita, detalle)
VALUES ('2023-04-09', 'angelica', 'e');
-- Clientes

INSERT INTO Cliente (rut, nombres, apellidos, telefono, direccion, comuna, edad)
VALUES ('123456789', 'John', 'Doe', 1234567, '123 Main St', 'Example Town', 30);

INSERT INTO Cliente (rut, nombres, apellidos, telefono, direccion, comuna, edad)
VALUES ('987654321', 'Jane', 'Smith', 9876543, '456 Elm St', 'Sample City', 28);

INSERT INTO Cliente (rut, nombres, apellidos, telefono, direccion, comuna, edad)
VALUES ('567890123', 'Michael', 'Johnson', 5551234, '789 Oak Ave', 'Another Place', 42);

INSERT INTO Cliente (rut, nombres, apellidos, telefono, direccion, comuna, edad)
VALUES ('901234567', 'Emily', 'Williams', 9879876, '567 Pine Rd', 'Different City', 23);

INSERT INTO Cliente (rut, nombres, apellidos, telefono, direccion, comuna, edad)
VALUES ('345678901', 'David', 'Anderson', 2345678, '234 Birch Ln', 'New Village', 37);

INSERT INTO Cliente (rut, nombres, apellidos, telefono, direccion, comuna, edad)
VALUES ('789012345', 'Sophia', 'Brown', 8765432, '678 Maple Rd', 'Old Town', 29);

INSERT INTO Cliente (rut, nombres, apellidos, telefono, direccion, comuna, edad)
VALUES ('234567890', 'James', 'Wilson', 4567890, '890 Oak St', 'Hometown', 31);

INSERT INTO Cliente (rut, nombres, apellidos, telefono, direccion, comuna, edad)
VALUES ('678901234', 'Olivia', 'Martinez', 7654321, '123 Elm Ave', 'Familiar City', 26);
