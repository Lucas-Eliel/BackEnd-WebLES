package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import orm.ConectionDB;
import vo.produtos;



public class produtoDAO extends ConectionDB {
        
	private static produtoDAO instance;

        
	public static produtoDAO getInstance(){
		if(instance == null)
			instance = new produtoDAO();
		return instance;
	}
                        

        public ArrayList<produtos> listarProdutos(String idusuario) throws ParseException, IOException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<produtos> result = null;
		
		conexao = criarConexao();
		result = new ArrayList<produtos>();
                
		try {
			pstmt = conexao.prepareStatement("select * from b_produto "+
                                                         "where idusuariofk = "+idusuario+" ");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				produtos produtos = new produtos();
				
				produtos.setIdProduto(rs.getString("idproduto"));
                                produtos.setIdUsuario(rs.getString("idusuariofk"));
                                produtos.setNome(rs.getString("nome"));
                                produtos.setModelo(rs.getString("modelo"));
                                produtos.setVersao(rs.getString("versao"));
                                produtos.setLogo(rs.getString("logo"));
                                produtos.setDownload(rs.getString("download"));
				result.add(produtos);
			}
			
		} catch (Exception e) {
                        System.out.println("Status:" + e);                        
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return result;
        }
        
        
         public ArrayList<produtos> listarProdutoSelecionado(String idproduto) throws ParseException, IOException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<produtos> result = null;
		
		conexao = criarConexao();
		result = new ArrayList<produtos>();
                
		try {
			pstmt = conexao.prepareStatement("select * from b_produto "+
                                                         "where idproduto = "+idproduto+" ");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				produtos produtos = new produtos();
				
				produtos.setIdProduto(rs.getString("idproduto"));
                                produtos.setIdUsuario(rs.getString("idusuariofk"));
                                produtos.setNome(rs.getString("nome"));
                                produtos.setModelo(rs.getString("modelo"));
                                produtos.setVersao(rs.getString("versao"));
                                produtos.setLogo(rs.getString("logo"));
                                produtos.setDownload(rs.getString("download"));
				result.add(produtos);
			}
			
		} catch (Exception e) {
                        System.out.println("Status:" + e);                        
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return result;
        }
        
        
        public ArrayList<produtos> listarProdutos() throws ParseException, IOException{
            Connection conexao = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            ArrayList<produtos> result = null;

            conexao = criarConexao();
            result = new ArrayList<produtos>();

            try {
                    pstmt = conexao.prepareStatement("select * from b_produto");
                    rs = pstmt.executeQuery();

                    while(rs.next()){
                            produtos produtos = new produtos();

                            produtos.setIdProduto(rs.getString("idproduto"));
                            produtos.setIdUsuario(rs.getString("idusuariofk"));
                            produtos.setNome(rs.getString("nome"));
                            produtos.setModelo(rs.getString("modelo"));
                            produtos.setVersao(rs.getString("versao"));
                            produtos.setLogo(rs.getString("logo"));
                            produtos.setDownload(rs.getString("download"));
                            result.add(produtos);
                    }

            } catch (Exception e) {
                    System.out.println("Status:" + e);                        
            } finally {
                    fecharConexao(conexao, pstmt, rs);
            }
            return result;
        }
        
        
        
}
