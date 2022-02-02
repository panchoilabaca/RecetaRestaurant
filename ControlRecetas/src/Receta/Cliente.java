package Receta;

public class Cliente {
	
	private String nombre;
	private int cuenta;
	public Cliente(String nombre, int cuenta) {
		
		this.nombre = nombre;
		this.cuenta = cuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	

}
