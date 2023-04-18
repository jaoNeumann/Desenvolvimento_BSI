package abc;
/*
AUTHOR: JOÃO PEDRO NEUMANN
DATE: 2023-04-13
TITLE: ENTREGA PARA DIA 13/04
*/
import java.util.Scanner;

public class consome_cliente extends cliente {
    /* Metodo grava em arquivo */
    public static void main(String[] args) {
        try {
            Scanner input_text = new Scanner(System.in);     
            cliente pessoa = new cliente();
            System.out.println("Insira os valores");            
            String op = "";
            while (!op.equals("0")) {
                System.out.println("Digite 0 para terminar");
    
                System.out.println("Cpf");
                input_text = new Scanner(System.in);
                pessoa.setCpf(input_text.nextLine());
                
                System.out.println("Nome");
                input_text= new Scanner(System.in);
                pessoa.Nome = input_text.nextLine();

                System.out.println("Email");
                input_text= new Scanner(System.in);
                pessoa.Email = input_text.nextLine();

                System.out.println("Tel");
                input_text= new Scanner(System.in);
                pessoa.Tel = input_text.nextLine();

                pessoa.salvar();
                System.out.println("Deseja continuar? (0 para sair)");
                op = input_text.nextLine();
            
                pessoa.find_one( ,pessoa.linha);
            
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Deu ruim patão");
            e.printStackTrace();
        }
    }
}
