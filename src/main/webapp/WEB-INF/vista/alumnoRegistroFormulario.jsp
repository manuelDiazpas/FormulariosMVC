<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Registro</title>
</head>
<body>

<center>
	<form:form action="procesarFormulario" modelAttribute="elAlumno">
	
	Nombre: <form:input path="nombre"/>
	<form:errors path="nombre" style="color:red"/>
	
	<br><br><br>
	
	Apellido: <form:input path="apellido"/>
	
	<br><br><br>
	
	Edad: <form:input path="edad"/>
	<form:errors path="edad" style="color:red"/>
	
	<br><br><br>

	Sexo: M<form:radiobutton path="sexo" value="Masculino"/> F<form:radiobutton path="sexo" value="Femenino"/>

	<br><br><br>
	
	Email: <form:input path="email"/>
	<form:errors path="email" style="color:red"/>
	
	<br><br><br>
	
	Telefono Movil: <form:input path="telefono"/>
	<form:errors path="telefono" style="color:red"/>
	
	<br><br><br>
	
	C. postal: <form:input path="codigoPostal"/>
	<form:errors path="codigoPostal" style="color:red"/>
	
	<br><br><br>
	
	Asignaturas Optativas:<br/>
	
	<form:select path="optativa" multiple="true">
	
		<form:option value="Diseño" label="Diseño"></form:option>
		<form:option value="Karate" label="Karate"></form:option>
		<form:option value="Educacion Fisica" label="Educacion Fisica"></form:option>
		<form:option value="Psicologia" label="Psicologia"></form:option>
	
	</form:select>
	
	<br><br><br>
	
	1<form:radiobutton path="plantaEstudios" value="1"/>
	2<form:radiobutton path="plantaEstudios" value="2"/>
	3<form:radiobutton path="plantaEstudios" value="3"/>
	
	<br><br><br>
	
	Ingles<form:checkbox path="idiomasAlumno" value="Ingles"/>
	Frances<form:checkbox path="idiomasAlumno" value="Frances"/>
	Aleman<form:checkbox path="idiomasAlumno" value="Aleman"/>
	Chino<form:checkbox path="idiomasAlumno" value="Chino"/>
	
	
	<br><br><br>
	
	<input type="submit" value="Enviar">
	
	
	</form:form>

</center>

</body>
</html>