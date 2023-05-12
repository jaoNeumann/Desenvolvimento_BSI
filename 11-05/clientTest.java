package env;

public class clientTest{
    public static void main(String[] args) {
        cliente cliente = new cliente();
        
        // search by cpf
        cliente.find_one("11111111111");
        
        System.out.println("CPF: " + cliente.cpf + "| Nome: " + cliente.nome + "| idade: " + cliente.idade);
        
    }
}
