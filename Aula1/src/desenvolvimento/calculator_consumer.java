package desenvolvimento;

public class calculator_consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator calc = new calculator(); //instancia | constroi um objeto tipo calculadora
		
		calc.fator_1 = 01;
		calc.fator_2 = 956;
		
//		System.out.println(calc.sum(calc.num1, calc.num2));
			System.out.println(calc.soma_zera(calc.fator_1, calc.fator_2));	
			System.out.println(calc);
			
	 }

}
