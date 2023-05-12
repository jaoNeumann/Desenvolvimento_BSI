package env;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cliente {
    public String nome;
    public String cpf;
    public int idade;

    public void find_one(String cpf){

        String url = "jdbc:mysql://localhost:3306/novobancoteste";
        String usuario = "root";
        String senha = "positivo";

        try {
            // carrega o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // estabelece a conexão com o MySQL
            Connection conn = DriverManager.getConnection(url, usuario, senha);                        
            // realiza operações com o banco de dados aqui...
            String slq = "select * from cliente where cpf   = ?";
            // prepara o comando
            PreparedStatement ps = conn.prepareStatement(slq);
            // atribui valores aos parametros

            ps.setString(1, "11111111111");
           
            // executa o sql e recebe o objeto o tipo ResultSet
            ResultSet rs = ps.executeQuery();
           
            if(rs.next()){
                this.cpf = rs.getString("cpf");
                this.nome = rs.getString("name");
                this.idade = rs.getInt("age");
            }

            // percorre os registros retornados pela instrução SQL
            // while (rs.next()) {
            //     int id = rs.getInt("id");
            //     String nome = rs.getString("nome");
            //     String email = rs.getString("email");
                
            //     operações com os valores recebidos
            //     System.out.println(id + " " + nome + " " + email);
            // }
            
            // save()
            //exemplo de insert into
            //String sql = "insert into clientes (id, cpf, nome, email) values (?, ?, ?, ?)";
            //  PreparedStatement ps = conn.prepareStatement(sql);
            //  ps.setInt(1, 3);
            //  ps.setString(2, "101010");
            //  ps.setString(3, "sergio malandro");
            //  ps.setString(4, "malandro@mail.com");
                   
            //  int retorno = ps.executeUpdate();
            //  System.out.println(retorno);
                    
            //     exemplo update
            //  String sql = "update clientes set email = ?  where cpf = ?";
            //  PreparedStatement ps = conn.prepareStatement(sql);
            //  ps.setString(1, "Pedrao@mail.com");
            //  ps.setString(2, "888");
            //  int retorno = ps.executeUpdate();
            //  System.out.println(retorno);
                    
            //     //exemplo delete
            //     String sql = "delete from clientes where cpf = ?";
            //     PreparedStatement ps = conn.prepareStatement(sql);
            //     ps.setString(1,  "888");
            //     ps.executeUpdate();
                
                
            // fecha a conexão
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível carregar o driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Não foi possível estabelecer a conexão com o MySQL.");
            e.printStackTrace();
        }
    }
}
