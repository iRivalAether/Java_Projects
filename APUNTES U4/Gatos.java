package U4Ejemplos;

public class Gatos extends Mascota {

	public Gatos(String nombre, String raza, String color) {
		super(nombre, raza, color);
		// TODO Auto-generated constructor stub
	}

	public String info() {
		// TODO Auto-generated method stub
		return "Nombre del gato:"+this.getNombre()+" Raza:"+this.getRaza()+" Color :"+this.getColor();
	}

}
