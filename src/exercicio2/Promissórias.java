package exercicio2;

public class Promissórias implements IRecebivel {

	@Override
	public double calcularValorRecebivel(int dias, double valor) {

		double calculo = 0;

		if (dias == 30) {
			calculo = valor - (valor * (4 / 100));
		} else if (dias == 60) {
			calculo = valor - (valor * (6.5 / 100));
		} else if (dias == 90) {
			calculo = valor - (valor * (8.5 / 100));
		}

		return calculo;
	}

}
