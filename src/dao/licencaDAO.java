package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import orm.ConectionDB;
import vo.licenca;

public class licencaDAO extends ConectionDB {
        
	private static licencaDAO instance;
        public String usuarioStatus; 
        public int sizeRs; 
        public String user; 
        public String senha;
	
	public static licencaDAO getInstance(){
		if(instance == null)
			instance = new licencaDAO();
		return instance;
	}
                        

        public ArrayList<licenca> listarLicenca(String idproduto) throws ParseException, IOException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<licenca> serial = null;
		
		conexao = criarConexao();
		serial = new ArrayList<licenca>();
		try {
			pstmt = conexao.prepareStatement("select * from b_produto "+
                                                         "inner join ba_licenca on idprodutofk = idproduto "+
                                                         "where idproduto = "+idproduto+" ");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				licenca licenca = new licenca();
				
				licenca.setLicenca(rs.getString("codigo"));
                                licenca.setUsuario(rs.getString("usuario"));
                                licenca.setToken(rs.getString("token"));
				serial.add(licenca);
			}
			
		} catch (Exception e) {
                        System.out.println("Status:" + e);                        
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return serial;
        }
        
   
    public String validaLicenca(String user,String senha) throws ParseException, IOException{
        
            Connection conexao = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            conexao = criarConexao();
            this.user = user;            
            this.senha = senha;
            
            try {
                    
                    pstmt = conexao.prepareStatement("select * from ba_licenca "+
                                                     "where usuario = '"+this.user+"' and senha = '"+this.senha+"' ");                    
                    rs = pstmt.executeQuery();                  
                    sizeRs =0;
                    
                    while(rs.next()){                    
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
    


    public String validaToken(String token,String usuario) throws ParseException, IOException{
        
            Connection conexao = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            conexao = criarConexao();
            
            try {
                    
                    pstmt = conexao.prepareStatement("select * from ba_licenca "+
                                                     "where usuario = '"+usuario+"' and token = '"+token+"' ");                    
                    rs = pstmt.executeQuery();                  
                    sizeRs =0;
                    
                    while(rs.next()){                    
                        sizeRs = sizeRs + 1;
                    }

                    if(sizeRs > 0){                    
                        usuarioStatus = "{"+'"'+"token"+'"'+":[{"+'"'+"status"+'"'+":"+'"'+"true"+'"'+"}]}";                        
                    }else{                        
                        usuarioStatus = "{"+'"'+"token"+'"'+":[{"+'"'+"status"+'"'+":"+'"'+"false"+'"'+"}]}";                    
                    }
                    

            } catch (Exception e) {
                    System.out.println("Erro ao validar o usuário: " + e);
                    e.printStackTrace();
            } finally {
                    fecharConexao(conexao, pstmt, rs);
            }
            return usuarioStatus;
    }

    
        public String setLicenca(String token,String usuario) throws ParseException, IOException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<licenca> serial = null;
		
		conexao = criarConexao();
		serial = new ArrayList<licenca>();
		try {
			pstmt = conexao.prepareStatement("update ba_licenca set token = '"+token+"' where usuario= '"+usuario+"' ");
			pstmt.execute();
			
		} catch (Exception e) {
                        System.out.println("Status:" + e);                        
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return "true";
        }
        
}
