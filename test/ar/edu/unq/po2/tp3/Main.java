package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

import org.junit.Before;

public class Main {
	
	public static void main(String[] args) {
		LocalDate fechaNac1 = LocalDate.of(1998, 01, 8);
		LocalDate fechaNac2 = LocalDate.of(2000, 10, 18);
		Persona agustin = new Persona();
		agustin.setFechaNac(fechaNac1);
		Persona martin = new Persona();
		martin.setFechaNac(fechaNac2); 
		EquipoDeTrabajo google = new EquipoDeTrabajo();
		google.agregarPersona(agustin);
		google.agregarPersona(martin);
		System.out.println(google.promedioDeEdad());
	}
}


