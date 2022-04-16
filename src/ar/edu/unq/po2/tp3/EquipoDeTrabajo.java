package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> equipo = new ArrayList<Persona>();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List getEquipo() {
		return equipo;
	}
	public void agregarPersona(Persona persona) {
		equipo.add(persona);
	}
	
	
	public String nombreDeEquipo() {
		return nombre;
	}
	
	public int promedioDeEdad() {
		int total = 0;
		for(int i = 0; i<equipo.size(); i++) {
			//al integrante "i" del equipo le pido la edad y la sumo al total de edades
			total += equipo.get(i).edad();
		}
		return total / equipo.size();
	}
	
}
