package U2Ejemplos;

public class Renta {
	
	private Cliente cliente;
	private Vehiculo vehiculo;
	private int diarenta;
	private int mesrenta;
	private int anniorenta;
	private int diasrenta;
	
	public Renta(Cliente cliente, Vehiculo vehiculo, int diarenta, int mesrenta, int anniorenta, int diasrenta) {
		this.cliente=cliente;
		this.vehiculo=vehiculo;
		this.diarenta=diarenta;
		this.mesrenta=mesrenta;
		this.anniorenta=anniorenta;
		this.diasrenta=diasrenta;
	}
	public Cliente getCliente() {
		
		return cliente;
		
	}
	public Vehiculo getVehiculo() {	
		return vehiculo;
	}
	public int getDiarenta() {
		return diarenta;
	}
	public int getMesrenta() {
		return mesrenta;
	}
	public int getAnniorenta() {
		return anniorenta;
	}
	public int getDiasrenta() {
		return diasrenta;
	}
	
	public double Pago(){
		double pago;
		pago= this.diarenta * this.getVehiculo().getTarifa();
		return pago;
	}

	
	

}
