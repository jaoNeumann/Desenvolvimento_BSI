package packege1;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import packege1.Test_gson;

public class JsonToArray {	
    public static void main(String[] args) {
    	Test_gson testgson = new Test_gson();
    	
    	String json = testgson.toJsonString();
    	System.out.println(json);
        Gson gson = new Gson();
        
        JsonArray jsonArray = gson.fromJson(json, JsonArray.class);
        
        
        
//        List<String> cpfList = new ArrayList<String>();
//        List<String> nomeList = new ArrayList<String>();
//        List<String> emailList = new ArrayList<String>();
//        List<String> contaList = new ArrayList<String>();

        for(int i = 0;i < jsonArray.size(); i++){
        	
        	Cliente c = gson.fromJson(jsonArray.get(i), Cliente.class);
        	System.out.println("Nome do cliente: "+ c.Nome);
        	System.out.println("Cpf do cliente: "+ c.cpf);
        	System.out.println("Email do cliente: "+ c.Email);
        	System.out.println("Conta do cliente: "+ c.Conta + "\n");
        	
//            JsonObject jsonObject = jsonElement.getAsJsonObject();
//            cpfList.add(jsonObject.get("cpf").getAsString());
//            nomeList.add(jsonObject.get("Nome").getAsString());
//            emailList.add(jsonObject.get("Email").getAsString());
//            contaList.add(jsonObject.get("Conta").getAsString());
        }
        
//        for (JsonElement jsonElement : jsonArray) {
//        	
//            JsonObject jsonObject = jsonElement.getAsJsonObject();
//            cpfList.add(jsonObject.get("cpf").getAsString());
//            nomeList.add(jsonObject.get("Nome").getAsString());
//            emailList.add(jsonObject.get("Email").getAsString());
//            contaList.add(jsonObject.get("Conta").getAsString());
//        }
//
//        System.out.println("CPF List: " + cpfList);
//        System.out.println("Nome List: " + nomeList);
//        System.out.println("Email List: " + emailList);
//        System.out.println("Conta List: " + contaList);
    }
}
