package ar.edu.unlam.pb2;

public class PlantaTemporal extends Empleado {
	private final Double valor_horas = 200.0;

	public PlantaTemporal(Integer horas, Boolean conyugue, Integer hijos) {
		super(horas, conyugue, hijos);
	}

	@Override
	Double getSalario() {
		Double total = this.horas * this.valor_horas;
		total += getSalarioFamiliar();
		return total;
	}

}
