package U2Tareas;

public class Electrodomesticos {
private String Electro;
private int precio;
private int stock;


public Electrodomesticos() {
	this.Electro="Sin producto";
	this.precio=0;
	this.stock=0;
	
	

			
}

public Electrodomesticos(String Electro) {
	this.Electro=Electro;
	this.precio=0;
	this.stock=0;
	
			
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	
	this.precio = precio;
}

public int getStock() {
       
	return stock;
}

public void setStock(int stock) {
	
	this.stock = stock;
}

public Electrodomesticos(int precio,int stock, String Electro) {
	this.Electro=Electro;
	this.precio=precio;
	this.stock=stock;
	
}



public void mostrar() {
	System.out.println(this.Electro);
	System.out.println(this.precio);
	System.out.println(this.stock);

}

}
