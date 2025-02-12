package U4Tareas;

import java.util.ArrayList;

public class Consultorio implements Agenda {
	ArrayList <Cita> citas;
	public Consultorio() {
		this.citas = new ArrayList<>();
	}
	@Override
	public void agregarCita(Cita cita) {
		// TODO Auto-generated method stub
		this.citas.add(cita);
     
	}

	@Override
	public void eliminarCita(Cita cita) {
		// TODO Auto-generated method stub
		this.citas.remove(cita);

	}

	@Override
	public ArrayList<Cita> obtenerCitas() {
		// TODO Auto-generated method stub
		return this.citas;
	}

}
