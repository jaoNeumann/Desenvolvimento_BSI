package packege1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Cliente {
	public String cpf;
	public String Nome;
	public String Email;
	public String Conta;
	
//	public String gerar_json() {
//		//converte o objeto para enviar via net
//		GsonBuilder builder = new GsonBuilder();
//		builder.setPrettyPrinting();
//		Gson gson = builder.create();
//		return gson.toJson(this);
//	}
}
