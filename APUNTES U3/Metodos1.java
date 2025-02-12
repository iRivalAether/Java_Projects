package U3Ejemplos;
import javax.swing.JOptionPane;
public class Metodos1 {
	private double area1;
	private double area2;
	private double area3;
	private double area4;
	private double base;
	private double altura;
	private double radio;
	
	public double triangulo() {
		return area1=(base*altura)/2;
	}
	
	public double rectangulo() {
		return area2=base*altura;
	}
	
	public void leer() {
		base=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base:"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura:"));
		radio=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio:"));
		
	}

	public double circulo () {
		return area3= Math.PI*Math.pow(2, radio);
	}
	
	public double cilindrio() {
		return area4= Math.PI*Math.pow(2, radio)*altura;
	}
	//metodo area del circulo,metodo area del cilindro
	public void imprimir() {
		JOptionPane.showMessageDialog(null, "Area triangulo="+this.triangulo()+"\n"+"Area rectangulo="+this.rectangulo()+"\n"+"Area del circulo="+this.circulo()+"\n"+"Area del cilindro="+this.cilindrio());
		
	}
	
}
