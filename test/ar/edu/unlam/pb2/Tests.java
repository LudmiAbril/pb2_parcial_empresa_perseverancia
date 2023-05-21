package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void testUnEmpleadoDePlantaTemporaria() {
		PlantaTemporal empleado = new PlantaTemporal(80, true, 0);
		Double obtenido = empleado.getSalario();
		Double deseado = 16100.0;
		
		assertEquals(obtenido, deseado);
	}

	@Test
	public void testUnEmpleadoDePlantaPermanente() {
		PlantaPermanente empleado = new PlantaPermanente(80, true, 2, 6);
		Double obtenido = empleado.getSalario();
		Double deseado = 25100.0;
		
		assertEquals(obtenido, deseado);
	}

	@Test
	public void testUnEmpleadoDePlantaPermanenteSinEsposaNiHijos() {
		PlantaPermanente empleado = new PlantaPermanente(160, false, 0, 4);
		Double obtenido = empleado.getSalario();
		Double deseado = 48400.0;
		
		assertEquals(obtenido, deseado);
	}

	@Test
	public void testUnEmpleadoGerente() {
		Gerente empleado = new Gerente(160, true, 1, 10);
		Double obtenido = empleado.getSalario();
		Double deseado = 65800.0;
		
		assertEquals(obtenido, deseado);
	}

	@Test
	public void testEmpresa() {
		Empresa empresa = new Empresa("17-54354345-76", "La perseverancia");
		PlantaTemporal emp1 = new PlantaTemporal(80, true, 0);
		PlantaPermanente emp2 = new PlantaPermanente(80, true, 2, 6);
		PlantaPermanente emp3 = new PlantaPermanente(160, false, 0, 4);
		Gerente emp4 = new Gerente(160, true, 1, 10);

		empresa.agregarEmpleado(emp1);
		empresa.agregarEmpleado(emp2);
		empresa.agregarEmpleado(emp3);
		empresa.agregarEmpleado(emp4);

		Double totalDeseado = empresa.getSalariosTotales();
		Double totalObtenido = 155400.0;

		assertEquals(totalObtenido, totalDeseado);
		assertEquals(empresa.getCantidadDeEmpleados(), (Integer) 4);
		assertEquals(empresa.getCuit(), "17-54354345-76");
		assertEquals(empresa.getrSocial(), "La perseverancia");
	}

}
