
#Datos de prueba ingresados
USE ProyectoDS;

INSERT INTO TIPO_USUARIO
VALUES("Vendedor","Personas que realizan ventas"),
		("Administrador","Persona que administra la BD"),
        ("Gerente","Persona que administra el local"),
        ("Jefe de bodega","Persona que administra la bodega");

INSERT INTO USUARIOS
VALUES("jpiguave","123abc","Vendedor"),
		("jperez","234bcd","Vendedor"),
        ("fmartinez","345cde","Vendedor"),
        ("jalvarez","abc123","Gerente"),
        ("vsalazar","123456","Administrador"),
        ("uperlaza","234567","Jefe de bodega");

INSERT INTO LOCAL(DIRECCION,CIUDAD,PAIS,TELEFONO)
VALUES("Alborada","Guayaquil","Ecuador","2876654");

INSERT INTO BODEGA(DIRECCION,CIUDAD,PAIS,TELEFONO)
VALUES("9 de Octubre","Guayaquil","Ecuador","2874423");

INSERT INTO VENDEDOR(NOMBRE,APELLIDO,CEDULA,EMAIL,ID_LOCAL,USERNAME)
VALUES("Javier","Piguave","0987753311","jpigu@gmail.com",1,"jpiguave"),
		("Juan","Perez","0981188732","jpez@gmail.com",1,"jperez"),
        ("Fernando","Martinez","0989977343","fmar@gmail.com",1,"fmartinez");

INSERT INTO GERENTE(NOMBRE,APELLIDO,CEDULA,EMAIL,ID_LOCAL,USERNAME)
VALUES("Jaime","Alvarez","0987333121","jalva@gmail.com",1,"jalvarez");

INSERT INTO JEFE_BODEGA(NOMBRE,APELLIDO,CEDULA,EMAIL,ID_BODEGA,USERNAME)
VALUES("Umberto","Perlaza","0983631224","uper@gmail.com",1,"uperlaza");

INSERT INTO CATEGORIA(CATEGORIA,DESCRIPCION)
VALUES("COMPUTO","EQUIPO DE COMPUTO"),
		("ACCESORIOS","EXTRAS DE COMPUTO Y CELULARES"),
        ("CABLES","CABLES DE DIFERENTES TIPOS"),
        ("CELULAR","CELULARES DE DIFERENTES MODELOS");

INSERT INTO PRODUCTO(NOMBRE,DESCRIPCION,PRECIO,CATEGORIA)
VALUES("TECLADO","TECLADO INALAMBRICO",30.00,"COMPUTO"),
		("MONITOR LG","MONITOR PLASMA",120.00,"COMPUTO"),
        ("SAMSUNG S7","CELULAR SAMSUNG",210.00,"CELULAR"),
        ("HUAWEI P30","CELULAR GAMA ALTA",180.00,"CELULAR"),
        ("ADAPTADOR VGA","CABLE ADAPTADOR",10.00,"CABLES"),
        ("TABLE A5","TABLE A5 SAMSUNG",130.00,"CELULAR"),
        ("MOUSE","MOUSE HP GAMER",25.00,"ACCESORIOS"),
        ("PARLANTES","PARLANTES CUADRADOS",10.00,"ACCESORIOS");

INSERT INTO PRODUCTO_LOCAL(NOMBRE_PRODUCTO,ID_LOCAL,CANTIDAD)
VALUES("MONITOR LG",1,10),
		("HUAWEI P30",1,20),
        ("MOUSE",1,30),
        ("PARLANTES",1,25),
        ("TABLE A5",1,10),
        ("TECLADO",1,0),
        ("SAMSUNG S7",1,0),
        ("ADAPTADOR VGA",1,0);

INSERT INTO PRODUCTO_BODEGA(NOMBRE_PRODUCTO,ID_BODEGA,CANTIDAD)
VALUES("MONITOR LG",1,100),
		("HUAWEI P30",1,200),
        ("MOUSE",1,400),
        ("PARLANTES",1,100),
        ("TABLE A5",1,100),
        ("TECLADO",1,90),
        ("SAMSUNG S7",1,40),
        ("ADAPTADOR VGA",1,300);
