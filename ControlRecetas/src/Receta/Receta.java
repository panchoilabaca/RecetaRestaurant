package Receta;

public class Receta {
	
	private String nombrePlato;
	private String ingrediente;
	Insumo insumo;
	
	public Receta(String nombrePlato, String ingrediente) {
		
		this.nombrePlato = nombrePlato;
		this.ingrediente = ingrediente;
		
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	

}
