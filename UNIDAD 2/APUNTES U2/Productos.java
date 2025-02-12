package U2Ejemplos;

public class Productos {
	private int codigo;
	private String insumo;
	private int precio;
	
	
	public int getCodigo() {
	
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getInsumo() {
		
		return insumo;
	}
	public void setInsumo(String insumo) {
		System.out.println("Usted pidio:"+insumo);
		this.insumo = insumo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		System.out.println("Tu producto cuesta:"+precio);
		this.precio = precio;
	}
	
    public String buscar(int codigo) {
    	String buscar = null;
        if(codigo == 101) {
        	setPrecio(25);
        	setInsumo("Cafe Del Dia");
        }
        else if(codigo == 102) {
        	setPrecio(60);
        	setInsumo("Cafe Capuchino Grande");
        }
        else if(codigo == 103) {
            setPrecio(50);
            setInsumo("Cafe Capuchino Pequeño");
        }
        else if(codigo == 104) {
        	setPrecio(58);
        	setInsumo("Cafe Late Grande");
        }
        else if(codigo == 105) {
        	setPrecio(48);
        	setInsumo("Cafe Late pequeño");
        }
        else if(codigo == 106) {
        	setPrecio(58);
        	setInsumo("Cafe Lechero Graande");
        }
        else if(codigo == 107) {
        	setPrecio(48);
            setInsumo("Cafe Lechero Pequeño");
        }
            
    	return buscar;
    }
    
    public void menu() {
    	System.out.println("Codigo!       insumo          !precio ");
    	System.out.println("101   !     cafe del dia      !  25$  ");
    	System.out.println("102   !cafe capuchino grande  !  60$  ");
    	System.out.println("103   !cafe capuchino pequeño !  50$  ");
    	System.out.println("104   !cafe late grande       !  58$  ");
    	System.out.println("105   1cafe late pequeño      !  48$  ");
    	System.out.println("106   !cafe lechero grande    !  58$  ");
    	System.out.println("107   !cafe lechero pequeño   !  48$  ");
    }
    
}
