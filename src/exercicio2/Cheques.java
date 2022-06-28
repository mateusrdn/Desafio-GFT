package exercicio2;

public class Cheques implements IRecebivel {

	@Override
	public double calcularValorRecebivel(int dias, double valor) {

		double calculo = 0;

		if (dias == 30) {
			calculo = valor - (valor * (5 / 100));
		} else if (dias == 60) {
			calculo = valor - (valor * (7.5 / 100));
		} else if (dias == 90) {
			calculo = valor - (valor * (10 / 100));
		}

		return calculo;
	}
}
