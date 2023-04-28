package packege1;

public class Conta_corrente {
	public int numero;
	public int type;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double value) {
		this.saldo = saldo;
	}
	
	public void sacar(double value_sacar) {
		if(value_sacar>0){
		this.saldo-= value_sacar;
			String sacou = "Saque realizado";
		}else {
			String sacou = "Valor inválido ou Saldo insuficiente";
		}
	}
	public void depositar(double value_depositar) {
		if(value_depositar>0){
		this.saldo+= value_depositar;
			String sacou = "Deposito realizado";
		}else {
			String sacou = "Valor inválido, depósito não realizado";
		}
	}
	
	
}

