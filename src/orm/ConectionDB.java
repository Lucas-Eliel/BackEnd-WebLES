package orm;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.json.simple.parser.ParseException;



public class ConectionDB {

    private String DRIVER;
    private String URL;
    private String USUARIO;
    private String SENHA;    


    public Connection criarConexao() throws ParseException, IOException{
                        
        DRIVER = "org.postgresql.Driver";
        URL = "jdbc:postgresql://191.252.202.70:5432/site";
        USUARIO = "postgres";
        SENHA = "postgres";
        Connection conexao = null;

        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (Exception e) {

        }
        return conexao;
    }



    public void fecharConexao(Connection conexao, PreparedStatement pstmt, ResultSet rs){
        try {
            if(conexao != null){
                conexao.close();
            }
            if(pstmt != null){
                    pstmt.close();
            }
            if(rs != null){
                    rs.close();
            }
        } catch (Exception e) {
                System.out.println("Erro ao fechar conexão com o banco: " + URL);
        }
    } 
    

}
