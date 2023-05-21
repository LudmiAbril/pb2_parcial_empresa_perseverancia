package ar.edu.unlam.pb2;

public class PlantaPermanente extends Empleado {
	private final Double valor_hora = 300.0;
	private final Double valor_antiguedad = 100.0;
	protected Integer antiguedad;

	public PlantaPermanente(Integer horas, Boolean conyugue, Integer hijos, Integer antiguedad) {
		super(horas, conyugue, hijos);
		this.antiguedad = antiguedad;
	}

	@Override
	Double getSalario() {
		Double horas = this.horas * this.valor_hora;
		Double antiguedad = this.antiguedad * this.valor_antiguedad;

		Double total = horas + antiguedad + getSalarioFamiliar();
		
		return total;
	}

}
