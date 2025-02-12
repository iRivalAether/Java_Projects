package U2Ejemplos;

public class Productos1 {
private int Codigo;
private String Insumo;
private int Precio;


public Productos1() {
	this.Codigo=0;
	this.Insumo="sin producto";
	this.Precio=0;
			
}

public Productos1(String insumo) {
	this.Codigo=0;
	this.Insumo=insumo;
	this.Precio=0;
}

public Productos1(int codigo,String insumo, int precio) {
	this.Codigo=codigo;
	this.Insumo=insumo;
	this.Precio=precio;
}
	public void mostrar() {
		System.out.println(this.Codigo);
		System.out.println(this.Insumo);
		System.out.println(this.Precio);
		
	
	}

}

