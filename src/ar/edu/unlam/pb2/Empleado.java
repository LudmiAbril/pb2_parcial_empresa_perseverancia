package ar.edu.unlam.pb2;

public abstract class Empleado {
	protected Integer horas;
	protected Boolean conyugue;
	protected Integer hijos;
	protected final Double valor_hijos=200.0;
	protected final Double valor_conyugue=100.0;
			
	public Empleado(Integer horas, Boolean conyugue, Integer hijos) {
		this.horas = horas;
		this.conyugue = conyugue;
		this.hijos = hijos;
	}
	
	abstract Double getSalario();
	
	public Double getSalarioFamiliar() {
		Double total= this.hijos*this.valor_hijos;
		
		if(this.conyugue) {
			total+=100;
		}
				
		return total;
		
	}
	
	

}
