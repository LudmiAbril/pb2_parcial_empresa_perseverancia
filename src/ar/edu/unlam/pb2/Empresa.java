package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Empresa {
	private String cuit;
	private String rSocial;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public Empresa(String cuit, String rSocial) {
		this.cuit = cuit;
		this.rSocial = rSocial;

	}
	
	public Double getSalariosTotales() {
		Double total=0.0;
		for(Empleado e : empleados) {
			total+=e.getSalario();
		}
		return total;
	}

	public Integer getCantidadDeEmpleados() {
		return this.empleados.size();
	}

	public void agregarEmpleado(Empleado emp) {
		this.empleados.add(emp);

	}

	public String getCuit() {
		return cuit;
	}

	public String getrSocial() {
		return rSocial;
	}

	

}
