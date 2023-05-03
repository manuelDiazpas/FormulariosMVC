<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion de Registro</title>
</head>
<body>


<center>
<br><br><br><br><br>
El alumno con nombre <strong>${elAlumno.nombre}</strong>, apellido <strong>${elAlumno.apellido}</strong>, edad <strong>${elAlumno.edad}</strong>, sexo <strong>${elAlumno.sexo}</strong>, E-Mail <strong>${elAlumno.email}</strong> y C. Postal <strong>${elAlumno.codigoPostal}</strong> se ha registrado con exito.
<br>
Su telefono <strong>${elAlumno.telefono}</strong> sera almacenado para eventos futuros.
<br>
La asignatura optativa escogida de modalidad optativa es <strong>${elAlumno.optativa}</strong>
<br>
El numero de planta donde espera iniciar los estudios es la planta número: <strong>${elAlumno.plantaEstudios}</strong>. Tomaremos en cuenta su preferencia.
<br>
Los idiomas escogidos son: <strong>${elAlumno.idiomasAlumno}</strong>
</center>
</body>
</html>