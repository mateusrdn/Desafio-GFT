package exercicio3;

public class Trabalhador {

	private String nome;
	private double salarioPorHora;
	private int horasTrabalhadas;
	
	public Trabalhador() {
	}

	public Trabalhador(String nome, double salarioPorHora, int horasTrabalhadas) {
		this.nome = nome;
		this.salarioPorHora = salarioPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioPorHora() {
		return salarioPorHora;
	}
	
	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHoraTrabalhada(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double calcularSalario(double valor, int horas) {
			return valor * horas;
	}  
	

	@Override
	public String toString() {
		return "Trabalhador nome=" + nome + 
				", salarioPorHora=" + salarioPorHora + 
				", horaTrabalhada=" + horasTrabalhadas + 
				"salario = " + calcularSalario(salarioPorHora, horasTrabalhadas);
	}
	
}
