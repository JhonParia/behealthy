/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceania');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO comidas (id, nombre) VALUES (1, 'Desayuno');
INSERT INTO comidas (id, nombre) VALUES (2, 'Media Mañana');
INSERT INTO comidas (id, nombre) VALUES (3, 'Almuerzo');
INSERT INTO comidas (id, nombre) VALUES (4, 'Media Tarde');
INSERT INTO comidas (id, nombre) VALUES (5, 'Cena');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Andrés', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

/* Creamos algunos usuarios con sus roles */
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('andres','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq', 1, 'Andres', 'Guzman','profesor@bolsadeideas.com', 183, 80, 28, '2018-07-06');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK', 1, 'John', 'Paria','jhon.paria@dynamis.pe',173, 90, 34, '2018-04-06');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('jose','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Jose', 'Rojas','jose.rojas@bolsadeideas.com', 168, 98, 27, '2018-05-06');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('sara','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Sara', 'Rojas','jos@bolsadeideas.com', 168, 98, 23, '2018-04-06');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('nelly','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Nelly', 'Rojas','jo@bolsadeideas.com', 178, 55, 19, '2019-05-16');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('javier','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Javier', 'Rojas','je.as@bolsadeideas.com', 158, 66, 35, '2019-05-26');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('juana','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Juana', 'Rojas','je1.as@bolsadeideas.com', 188, 66, 45, '2019-04-26');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('jess','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Jessica', 'Rojas','je2.as@bolsadeideas.com', 198, 66, 55, '2019-03-26');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('maria','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Maria', 'Rojas','je3.as@bolsadeideas.com', 148, 66, 15, '2019-02-26');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('jara','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Jara', 'Rojas','je4.as@bolsadeideas.com', 166, 66, 25, '2019-01-26');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, talla, peso, edad, create_at) VALUES ('javier3','$2a$10$4d8.A94N8LiCeJiPys11nu4flSojjcvlWD7sPtLKx8qL5.GRTwnpW' , 1, 'Javi', 'Rojas','je5.as@bolsadeideas.com', 177, 66, 38, '2019-05-26');


INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (3, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (4, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (5, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (6, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (7, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (8, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (9, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (10, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (11, 1);



/* Populate tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES('Escala inteligente Fitbit Aria 2 ', 130, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('iFit Sleep HR Sleep Tracker', 119, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Estimulador el�ctrico de m�sculos PowerDot', 199, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sistema de entrenamiento Skulpt Performance', 99, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Theragun G2Pro', 400, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Ox�metro de pulso Masimo iSpO2', 250, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Vyper 2, rodillo vibrador para ejercicios', 199, NOW());



/* Showing results for ejercicios.xlsx */
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Sentadillas','sentadillas.gif','Prese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.Gire las caderas para acomodar el trasero y doble las rodillas hasta que sus muslos queden paralelos al suelo. Conduce a trav�s de tus talones para pararte derecho. Aprieta tu trasero y mant�n tu n�cleo apretado mientras te paras.',300);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Curtsy con patada lateral','CurtsySideKicks.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.',320);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Patada de Burro','DonkeyKicks.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.',230);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Lomo de Burro','DonkeyWhips.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.Gire las caderas para acomodar el trasero ',240);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Ranas','froggers.gif','P�rese con las piernas m�s abiertas que el ancho de la cadera, las rodillas dobladas y la parte superior del cuerpo con la bisagra ligeramente hacia adelante',350);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Rodillas Altas','HighKnees.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.',130);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('PlanckJacks','planckjacks.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.',360);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Sentadillas','skater-hops.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.',50);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('ZancadaInversa','zancadainversa.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.',100);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Planchas anchas','WideGripPushUps.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.',200);
INSERT INTO ejercicios (nombre, foto, descripcion, caloria) VALUES('Abdominales Oblicuos Parada','standingobliguecrunch.gif','P�rese con los pies separados al ancho de los hombros y levemente hacia fuera con su peso en los talones.',370);


/* Creamos algunas planes de ejercicio */
INSERT INTO plan_ejercicios (descripcion, usuario_id, create_at) VALUES('train first', 1, NOW());
INSERT INTO plan_ejercicios (descripcion, usuario_id, create_at) VALUES('traino dt', 2, NOW());

INSERT INTO plan_ejercicio_items (cantidad, plan_ex__id, ejercicio_id) VALUES(1, 1, 1);
INSERT INTO plan_ejercicio_items (cantidad, plan_ex__id, ejercicio_id) VALUES(2, 1, 2);
INSERT INTO plan_ejercicio_items (cantidad, plan_ex__id, ejercicio_id) VALUES(3, 1, 10);
INSERT INTO plan_ejercicio_items (cantidad, plan_ex__id, ejercicio_id) VALUES(2, 1, 8);
INSERT INTO plan_ejercicio_items (cantidad, plan_ex__id, ejercicio_id) VALUES(2, 1, 3);
INSERT INTO plan_ejercicio_items (cantidad, plan_ex__id, ejercicio_id) VALUES(2, 2, 5);


/* Populate tabla alimentos */

/* INSERT QUERY NO: 1 */	
INSERT INTO alimentos(nombre, descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Acedias Fritas','acediasfritas.jpg', 256, 12, 17, 16, 0 );

/* INSERT QUERY NO: 6 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Aceite Oliva', 899, 0, 0, 100, 0 );
/* INSERT QUERY NO: 7 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Aceite Soja', 899, 0, 0, 100, 0 );
/* INSERT QUERY NO: 8 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Aceite Uva- Pepita', 899, 0, 0, 100, 0 );
/* INSERT QUERY NO: 9 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Aceitunas Salmuera', 103, 0, 1, 11, 4 );
/* INSERT QUERY NO: 10 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Acelgas', 13, 1, 2, 0, 6 );
/* INSERT QUERY NO: 11 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Acerolas', 31, 8, 0, 0, 0 );
/* INSERT QUERY NO: 12 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Agua Manantial', 0, 0, 0, 0, 0 );
/* INSERT QUERY NO: 13 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Aguacate', 223, 2, 4, 22, 3 );
/* INSERT QUERY NO: 14 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Ajo', 137, 28, 6, 0, 0 );
/* INSERT QUERY NO: 15 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Albaricoque', 28, 7, 1, 0, 2 );
/* INSERT QUERY NO: 16 */
INSERT INTO alimentos(nombre, descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Alcachofas','alcachofa.jpg', 22, 3, 2, 0, 11 );
/* INSERT QUERY NO: 17 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Almeja / Chirla', 50, 0, 11, 0, 0 );
/* INSERT QUERY NO: 18 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Almendras', 565, 4, 17, 54, 14 );
/* INSERT QUERY NO: 19 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Lentejas', 68, 0, 16, 0, 0 );
/* INSERT QUERY NO: 20 */
INSERT INTO alimentos(nombre, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Anchoas Enlatadas', 206, 0, 22, 13, 0 );

/* INSERT QUERY NO: 20 */
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Lentejas','lentejas.jpg', 116, 20, 9, 0, 0 );
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Avena','avena.jpg', 175, 29, 3, 6, 0 );
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Manzana','manzana.jpg', 59, 14, 0, 0, 0 );
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Jugo de Naranja','jugp-de-natarak.jpg', 32, 8, 0, 0, 0 );
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Granadilla','download.jpg', 17, 4, 0, 0, 0 );
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Arroz integral','integral.jpg', 124, 25, 2, 1, 0 );
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Papas al vapor','papas.jpg', 206, 17, 2, 0, 0 );
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Pescado al vapor','pescado.jpg', 206, 0, 24, 3, 0 );
INSERT INTO alimentos(nombre,descripcion, caloria, carbohidratos, proteinas, grasas, fibra)VALUES ('Pollo a la plancha','pollo.jpg', 230, 0, 27, 13, 0 );



/* Creamos algunas planes de comida */
INSERT INTO plan_comidas (descripcion, usuario_id, create_at) VALUES('Dieta first', 1, NOW());
INSERT INTO plan_comidas (descripcion, usuario_id, create_at) VALUES('Dieta dt', 2, NOW());

INSERT INTO plan_comida_items (cantidad, plan_comida__id, alimento_id, comida_id) VALUES(1, 1, 1, 1);
INSERT INTO plan_comida_items (cantidad, plan_comida__id, alimento_id, comida_id) VALUES(2, 1, 12, 2);
INSERT INTO plan_comida_items (cantidad, plan_comida__id, alimento_id, comida_id) VALUES(3, 1, 1, 3);
INSERT INTO plan_comida_items (cantidad, plan_comida__id, alimento_id, comida_id) VALUES(2, 1, 17, 4);
INSERT INTO plan_comida_items (cantidad, plan_comida__id, alimento_id, comida_id) VALUES(2, 1, 1, 5);
INSERT INTO plan_comida_items (cantidad, plan_comida__id, alimento_id, comida_id) VALUES(2, 2, 11, 1);







/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);