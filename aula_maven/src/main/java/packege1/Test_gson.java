package packege1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

public class Test_gson {

    public String toJsonString() {
        Cliente cli = new Cliente();
        Banco ban = new Banco();
        ban.clientes = new ArrayList<Cliente>();

        cli.cpf = "888";
        cli.Nome = "Pedro de Lara";
        cli.Email = "plara@mail.com";
        cli.Conta = "12";
        // add client to the list of clients in the bank object
        ban.clientes.add(cli);

        // create a new object of type Cliente
        cli = new Cliente();
        cli.cpf = "777";
        cli.Nome = "Rafael Moreira";
        cli.Email = "raffa@mail.com";
        cli.Conta = "13";

        ban.clientes.add(cli);

        cli = new Cliente();
        cli.cpf = "456";
        cli.Nome = "salamandra de fogo";
        cli.Email = "salafogo@mail.com";
        cli.Conta = "14";

        ban.clientes.add(cli);

        // create a Gson object to convert Cliente object to JSON format
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(ban.clientes);
        return json;
    }
}
