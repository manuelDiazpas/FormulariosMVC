package spring.mvc;

import java.util.Iterator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import spring.mvc.validacionespersonalizadas.TelefonoMovil;

public class Alumno {

	/*
	 * Habria que instalar la version 6.0 de hibernate si queremos que funcione el
	 * programa
	 */
	@NotNull
	@Size(min = 2, message = " Campo requerido")
	private String nombre;

	private String apellido;

	@NotNull
	@Min(value=10, message="No se permiten edades menores de 10")
	@Max(value=100, message="No se permiten edades mayores de 100")
	private Integer edad;
	
	private String sexo;
	
	@Email
	private String email;
	
	@TelefonoMovil
	@Min(value=9, message="Deben de ser 9 digitos")
	private String telefono;
	
	private String optativa;

	private String plantaEstudios;

	private String idiomasAlumno;

	// regexp="[limite de numeros o caracteres]{maxima cantidad}"
	@Pattern(regexp="[0-9]{5}", message="Solo 5 valores numéricos")
	private String codigoPostal;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOptativa() {
		return optativa;
	}

	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}

	public String getPlantaEstudios() {
		return plantaEstudios;
	}

	public void setPlantaEstudios(String ciudadEstudios) {
		this.plantaEstudios = ciudadEstudios;
	}

	public String getIdiomasAlumno() {
		return idiomasAlumno;
	}

	public void setIdiomasAlumno(String idiomasAlumno) {
		this.idiomasAlumno = idiomasAlumno;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	
	public void setTelefono(String telefono) {
			this.telefono = telefono;
	}

	
	
}
