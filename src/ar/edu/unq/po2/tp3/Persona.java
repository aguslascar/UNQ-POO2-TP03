package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre = null;
	private LocalDate fechaNac;
	
	public String nombre() {
		return nombre;
	}
	
	public LocalDate fechaDeNacimiento() {
		return fechaNac;
	}
	
	public int edad() {
		/**
		 * Esta funcion calcula la edad de la persona en base a la fecha actual y
		 * su fecha de nacimiento sin meses ni dias.
		 * 
		 */
		LocalDate fechaActual = LocalDate.now();
		//Calcula la edad usando Period, lo que devuelve un resultado en años meses y dias.
		//Luego tomo los años y es el resultado que devuelvo
		return Period.between(this.fechaNac,fechaActual).getYears();
	}
	
	public Boolean menorQue(Persona persona) {
		/**
		 * Devuelve true si la persona receptora es menor que la persona dada por parametro.
		 */
		return this.edad() < persona.edad();
	}
	
	public Persona() {
		super();
	}

	public Persona Persona(String nombre, LocalDate fechaDeNacimiento) {
		Persona nuevaPersona = new Persona();
		nuevaPersona.setNombre(nombre);
		nuevaPersona.setFechaNac(fechaDeNacimiento);
		return nuevaPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
}
