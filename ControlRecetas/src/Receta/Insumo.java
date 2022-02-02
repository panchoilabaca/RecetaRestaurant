package Receta;

public class Insumo {
	
	private String nombreProducto;
	private int costo;
	
	public Insumo(String nombreProducto, int costo) {
		
		this.nombreProducto = nombreProducto;
		this.costo = costo;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	

}
