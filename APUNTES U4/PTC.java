package U4Ejemplos;

public class PTC extends Profesor {

	private String salario;

	public PTC(String id, String nombre, String salario) {
		super(id, nombre);
		this.salario = salario;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
