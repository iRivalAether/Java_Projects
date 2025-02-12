package U4Ejemplos;

public class Ejemplo4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro dog = new Perro();
		Pato duck = new Pato();
		Serpiente snake = new Serpiente ();
		
		dog.sonido();
		dog.patas();
		System.out.println("Pelo:"+dog.pelo+" Color:"+dog.color);
		
		duck.sonido();
		duck.patas();
		
		snake.sonido();
		
		
	}

}
