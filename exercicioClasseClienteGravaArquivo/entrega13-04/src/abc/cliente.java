package abc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class cliente {

    private String Cpf;
    public String Nome;
    public String Email;
    public String Tel;
    public String path = ("c:\\\\_src\\gravacoes.txt");
    
    String separador = ", ";
    String linha = this.Nome + separador + 
    		this.Cpf + separador + 
    		this.Email + separador + 
    		this.Tel + System.lineSeparator();   
    
    public void salvar() {
        try {
            FileReader arq_read = new FileReader(path);
            FileWriter arquivo = new FileWriter(path, true);
            arquivo.write(linha);
            arquivo.flush();
            arquivo.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    public String getCpf() {
    	return this.Cpf;
    }
    public void setCpf(String value) {
    	this.Cpf = value;
    }
    
    public boolean find_one(String valueFindOne, String linha) throws IOException {
        FileReader arq_read = new FileReader(path);
        BufferedReader read = new BufferedReader(arq_read);
        String umaPessoa = read.readLine();
    	String[] lineVector = linha.split(",");
    	
    	if (lineVector[0].equals(lineVector)) {
    		
    		this.Cpf = Cpf;
    		this.Nome = Nome;
    		this.Email = Email;
    		this.Tel = Tel;
    		
    		return true;
    	}else {
    		return false;
    	}
    }
}
