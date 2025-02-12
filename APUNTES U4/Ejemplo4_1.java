package U4Ejemplos;

public class Ejemplo4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cantante cantante=new Cantante("Jeon Jungkook", "Standing next to you");
		Actor actor=new Actor("Cha Eunwoo", "Wonderful world");
		System.out.println(cantante.mostrar());
		cantante.mensaje();
		System.out.println(actor.mostrar());
		actor.mensaje();
	}

}
