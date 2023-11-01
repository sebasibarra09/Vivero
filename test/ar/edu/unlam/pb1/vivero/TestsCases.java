package ar.edu.unlam.pb1.vivero;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestsCases {
	
	/**
	 * Se deberan realizar los siguientes tests
	 * 
	 * - 1 test para el metodo agregarPlanta() que arroje la excepcion de validacion
	 * - 1 test para el metodo venderPlanta() que arroje una excepcion a eleccion
	 * - 1 test para el metodo obtenerTodasLasVentasDeArbolesOrdenadosPorElValorTotalDeLaVenta()
	 * - 1 test para el metodo obtenerReporteDePlantasAgrupadasPorTipo()
	 * - 1 test para el metodo obtenerTodasLasPlantasFlorales()
	 * - 1 test para el metodo obtenerPrecio() de la clase Planta 
	 * - 1 test para el metodo obtenerPrecio() de alguna clase que implemente la interfaz Florales en estado de floracion
	 * - 1 test para el metodo obtenerPrecio() de alguna clase que implemente la interfaz Florales en estado de produccion
	 * @throws PlantaDuplicadaException 
	 * */

	@Test
	public void queSePuedaAgregarUnaPlanta() throws PlantaDuplicadaException {
		Vivero vero = new Vivero ("Casita");
		Arbusto plantita1 = new Arbusto(1580, "plantita", 15.0, 15);
		Arbol plantita2 = new Arbol(1582, "plantita", 15.0, 15);
		//vero.agregarPlanta(plantita1);
		assertTrue(vero.agregarPlanta(plantita1));
	}
	
	@Test
	public void queNoSePuedaAgregarUnaPlanta() throws PlantaDuplicadaException {
		Vivero vero = new Vivero ("Casita");
		Planta plantita1 = new Arbol(1580, "plantita", 15.0, 15);
		Planta plantita2 = new Arbol(1581, "plantita", 15.0, 15);
		vero.agregarPlanta(plantita1);
		assertTrue(vero.agregarPlanta(plantita2));
	}

}
