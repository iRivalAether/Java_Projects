package U4Ejercicios;

public class Cita{

	private String fecha;
	Paciente paciente = new Paciente(null, 0);
	Medico medico = new Medico(null, null);
	
	public Cita(Paciente paciente, Medico medico,String fecha) {
		super();
		this.fecha=fecha;
		this.paciente=paciente;
		this.medico=medico;
		
	}

	public String getFecha() {
		return fecha;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}
	
	
	
	
	

}
