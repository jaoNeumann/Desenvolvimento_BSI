package desenvolvimento;

public class calculator {

	public double fator_1;
	public double fator_2;
	public double soma;

	public double sum(double valor1, double valor2) {
		//s = num1 + num2;
		//return (s);
		return (valor1 + valor2);
	}
	
	private void zerar_num1() {
		//Método exemplo que altera o valor de num1 para zero
		this.fator_1 = 0;
		
	}
	
	public double soma_zera(double valor1, double valor2) {
		zerar_num1();
		return(valor1 + valor2);
	}
}