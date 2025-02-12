package U4Tareas;

import java.util.ArrayList;

public class Tarea4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medico medico1 = new Medico("Dr.Roberto Mainez","Especialista Ortopedico");
		Medico medico2 = new Medico("Dr.Claudia Shainboun","Especialista en Anestesiología");
		Medico medico3 = new Medico("Dr.John Cena","Especialista en Urología");
		
		Paciente paciente1 = new Paciente("Bryan Diaz",18);
		Paciente paciente2 = new Paciente("Samuel Fernandez",23);
		Paciente paciente3 = new Paciente("Fernando Torres",34);
		
		Cita cita1 = new Cita(paciente1,medico1,"18 de octubre");
		Cita cita2 = new Cita(paciente2,medico2,"28 de febrero");
		Cita cita3 = new Cita(paciente3,medico3,"31 de enero");
		
		Consultorio consultorio = new Consultorio();
		
		consultorio.agregarCita(cita1);
		consultorio.agregarCita(cita2);
		consultorio.agregarCita(cita3);
		
		ArrayList<Cita> citas = consultorio.obtenerCitas();
		for (Cita cita : citas) {
		    System.out.println("Medico: " + cita.getMedico().getNombre() + ", Paciente: " + cita.getPaciente().getNombre() + ", Fecha: " + cita.getFecha());
		}
	}

}
