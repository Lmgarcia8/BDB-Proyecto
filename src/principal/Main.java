package principal;

import modelo.Medicamento;

public class Main {

	public static void main(String[] args) {
		BD bd = new BD();
		long startTime = System.currentTimeMillis();
		Medicamento p = bd.getMedicamento("FLUTOX");
		Medicamento g= bd.getMedicamentoPrecioAproximado(4.00, 7.00);
		
		long endTime = System.currentTimeMillis() - startTime;
		System.out.println(endTime);
		
		System.out.println("El id del medicamento es:\n Nombre"+p.getId());
		System.out.println("Los nombres de los medicamentos cuyo precio está entre los precios marcados son:"+g.getNombre());
		
		
		
	}

}
