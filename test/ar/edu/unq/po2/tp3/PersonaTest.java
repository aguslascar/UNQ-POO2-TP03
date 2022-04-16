package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonaTest {
	@Test
	void testCrearPersona() {
		LocalDate fechaNac = LocalDate.of(1998, 01, 8);
		Persona agustin = new Persona();
		assertEquals(24, agustin.Persona("Agustin", fechaNac).edad());
	}
	
	@Test
	void testMenorQue() {
		LocalDate fechaNac1 = LocalDate.of(1998, 01, 8);
		LocalDate fechaNac2 = LocalDate.of(2000, 10, 18);
		Persona agustin = new Persona();
		agustin.setFechaNac(fechaNac1);
		Persona martin = new Persona();
		martin.setFechaNac(fechaNac2);
		assertTrue(martin.menorQue(agustin));
	}

}
