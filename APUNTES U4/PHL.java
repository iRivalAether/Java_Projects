package U4Ejemplos;

public class PHL extends Profesor{

	private String horas;
	private String pagoh;
	
	public PHL(String id, String nombre, String horas, String pagoh) {
		super(id, nombre);
		this.horas=horas;
		this.pagoh=pagoh;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getPagoh() {
		return pagoh;
	}

	public void setPagoh(String pagoh) {
		this.pagoh = pagoh;
	}
	
	public String pago() {
		return null;
	}
	
}