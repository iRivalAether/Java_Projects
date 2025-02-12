package U2Ejemplos;

public class Vehiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String color;
	private double tarifa;
	private Boolean disponible;
	
	
	Vehiculo (String placa, String marca, String modelo,String color, double tarifa,Boolean disponible) {
    	this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.tarifa=tarifa;
		this.disponible=disponible;
	}
	
	public String getPlaca() {
		return placa;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getColor() {
		return color;
	}
	public double getTarifa() {
		return tarifa;
	}
	public Boolean isDisponible() {
		return disponible;
	}
	
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "vehiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa="
				+ tarifa + ", disponible=" + disponible + "]";
	}
	
	

}
