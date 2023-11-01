package ar.edu.unlam.pb1.vivero;

public class Arbol extends Planta{

	public Arbol(int codigo, String nombre, double precio, int stock) {
		super(codigo, nombre, precio, stock);
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setStock(stock);
		
	}



	private final double GANANCIA_ARBOL = 2.3;
	private Double estadoFloracion;
	private int madurezFrutos;

	

	@Override
	public Double obtenerPrecio() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Los arboles pueden dar flores, las que posteriormente se convertiran en frutos. 
	 * Las flores tienen un rango de crecimiento, siendo 0 (el valor inicial) cuando no tiene flores aun y 100 cuando ya estan aptas para dar frutos.
	 * El precio del arbol se incrementa de acuerdo al avance de la floracion:
	 * - Menos de 33% de floracion incrementa un 5% su precio. 
	 * - Entre 34% y 66% incrementa un 7.5% su precio.
	 * - Mas del 66% y menos de 100% incrementa un 8.5% su precio.
	 * - Cuando el estado de floracion llega al 100%, se comienza la produccion de frutos
	 * */

	/**
	 * Para poder producir frutos, el estado de floracion debe ser 100%.
	 * La produccion de frutos se mide entre 1 y 5 siendo 5 el mejor escenario.
	 * Cuando un arbol produce frutos, su precio aumenta 10% inicialmente (por tener el estado de floracion al 100%) y
	 * agrega al precio, el porcentaje de madurez. Ejemplo: precioBase = 100 + 10% (por floracion) + 3% (madurez actual de los frutos)
	 * */
}
