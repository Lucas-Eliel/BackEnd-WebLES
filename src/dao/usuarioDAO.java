package dao;

import java.io.IOException;
import orm.ConectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import vo.financeiro;
import vo.usuario;


public class usuarioDAO extends ConectionDB{
    
private static usuarioDAO instance;
public String usuarioStatus; 
public int sizeRs; 
public String user; 
public String senha;

    public static usuarioDAO getInstance(){
            if(instance == null)
                    instance = new usuarioDAO();
            return instance;
    }

    public String validaUsuario(String user,String senha) throws ParseException, IOException{
        
            Connection conexao = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            conexao = criarConexao();
            this.user = user;            
            this.senha = senha;
            
            try {
                    
                    pstmt = conexao.prepareStatement("select * from a_usuario inner join aa_acesso on idusuariofk = idusuario where usuario = '"+this.user+"' and senha = '"+this.senha+"' ");                    
                    rs = pstmt.executeQuery();                  
                    sizeRs = 0;
                    
                    while(rs.next() == true){                    
                        sizeRs = sizeRs + 1;
                    }

                    if(sizeRs > 0){                    
                        usuarioStatus = "{"+'"'+"login"+'"'+":[{"+'"'+"status"+'"'+":"+'"'+"true"+'"'+"}]}";                        
                    }else{                        
                        usuarioStatus = "{"+'"'+"login"+'"'+":[{"+'"'+"status"+'"'+":"+'"'+"false"+'"'+"}]}";                    
                    }
                    

            } catch (Exception e) {
                    System.out.println("Erro ao validar o usuário: " + e);
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, pstmt, rs);
            }
            return usuarioStatus;
    }


    public ArrayList<usuario> listarUsuario(String nome) throws ParseException, IOException{
            Connection conexao = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            ArrayList<usuario> result = null;

            conexao = criarConexao();
            result = new ArrayList<usuario>();

            try {
                    pstmt = conexao.prepareStatement("select * from a_usuario "+
                                                     "where UPPER(nome) = UPPER('"+nome+"') ");
                    rs = pstmt.executeQuery();

                    while(rs.next()){
                            usuario usuario = new usuario();

                            usuario.setIdUsuario(rs.getString("idusuario"));
                            usuario.setNome(rs.getString("nome"));
                            usuario.setDtCadastro(rs.getString("dtcadastro"));
                            usuario.setBairro(rs.getString("bairro"));
                            usuario.setRua(rs.getString("rua"));
                            usuario.setNumero(rs.getString("numero"));
                            usuario.setCidade(rs.getString("cidade"));
                            usuario.setCep(rs.getString("cep"));
                            usuario.setEmail(rs.getString("email"));
                            usuario.setCpfCnpj(rs.getString("cpfcnpj"));
                            usuario.setTelefone(rs.getString("telefone"));
                            usuario.setCelular(rs.getString("celular"));
                            usuario.setObs(rs.getString("obs"));
                            result.add(usuario);
                    }

            } catch (Exception e) {
                    System.out.println("Status:" + e);                        
            } finally {
                    fecharConexao(conexao, pstmt, rs);
            }
            return result;
    }
    
}
    

	