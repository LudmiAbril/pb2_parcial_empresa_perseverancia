package ar.edu.unlam.pb2;

public class Gerente extends PlantaPermanente {
	private final Double valor_hora = 400.0;
	private final Double valor_antiguedad = 150.0;

	public Gerente(Integer horas, Boolean conyugue, Integer hijos, Integer antiguedad) {
		super(horas, conyugue, hijos, antiguedad);
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
