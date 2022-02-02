package Receta;

public class Principal {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant("Carnes del centro ", "Moneda 3000");
		
		Persona chef1 = new Persona("Mario ", "Chef");
		Persona chef2 = new Persona("Juan ", "Sous Chef");
		Persona garzon1 = new Persona("Francisco ", "Garzon");
		Persona garzon2 = new Persona("Eduardo ", "Garzon");
		
		Cliente cliente1 = new Cliente("Manuel ", 20990);
		Cliente cliente2 = new Cliente("Maria ", 35000);
		
		Receta receta1 = new Receta("Entrañas a la parrilla con papas fritas ", "Entraña de vacuno y papas frescas ");
		Receta receta2 = new Receta("Lomo de vacuno con ensalada de tomates" , "Lomo de vacuno y tomates frescos");
		
		Insumo insumo1 = new Insumo("Entrañas de vacuno", 7990);
		Insumo insumo2 = new Insumo("Papas frescas", 1990);
		Insumo insumo3 = new Insumo("Lomo de vacuno", 5990);
		Insumo insumo4 = new Insumo("Tomates frescos", 1990);
		
		Venta venta1 = new Venta(20990);
		Venta venta2 = new Venta(35000);
		
		System.out.println("\n----------------Restaurant Carnes del Centro-------------------");
		System.out.println("\nEL cliente " + cliente1.getNombre() + " Ordenó a " + garzon1.getNombre() + " quien es " + garzon1.getCargo() + " del restaurant las " + receta1.getNombrePlato());
		System.out.println("\nEl plato fue preparado por " + chef1.getNombre() + " Quien es " + chef1.getCargo() + " del restaurant ");
		System.out.println("\nLa receta consta de " + receta1.getIngrediente() + " y tiene un costo de " + venta1.getPrecio() + " para 2 personas");
		System.out.println("\nEl precio a costo de este plato por cada insumo es de  " + insumo1.getCosto() + " las entrañas " +  insumo2.getCosto() + " las papas frescas" );
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\nEL cliente " + cliente2.getNombre() + " Ordenó a " + garzon2.getNombre() + " quien es " + garzon2.getCargo() + " del restaurant los " + receta2.getNombrePlato());
		System.out.println("\nEl plato fue preparado por " + chef2.getNombre() + " Quien es " + chef2.getCargo() + " del restaurant ");
		System.out.println("\nLa receta consta de " + receta2.getIngrediente() + " y tiene un costo de " + venta2.getPrecio() + " para 2 personas");
		System.out.println("\nEl precio a costo de este plato por cada insumo es de  " + insumo3.getCosto() + " lomo de vacuno " +  insumo4.getCosto() + " los tomates frescos" );
		
		

	}

}
