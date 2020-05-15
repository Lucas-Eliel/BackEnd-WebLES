package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import orm.ConectionDB;
import vo.adm;
import vo.financeiro;
import vo.integrate;
import vo.produtos;



public class  integrateDAO extends ConectionDB {
        
	private static integrateDAO instance;

        
	public static integrateDAO getInstance(){
		if(instance == null)
			instance = new integrateDAO();
		return instance;
	}
                        

        public ArrayList<integrate> gravarIntegrate(integrate dadosIntegrate) throws ParseException, IOException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<integrate> result = null;
		
		conexao = criarConexao();
		result = new ArrayList<integrate>();
                
		try {
			pstmt = conexao.prepareStatement("update bb_bdintegrate set nomebase ='"+dadosIntegrate.getNomeBase()+"', ip='"+dadosIntegrate.getIp()+"', porta='"+dadosIntegrate.getPorta()+"', usuario='"+dadosIntegrate.getUsuarioBanco()+"', senha='"+dadosIntegrate.getSenhaBanco()+"' where idprodutofk = '"+dadosIntegrate.getIdProduto()+"' ");
			pstmt.execute();
			
			
		} catch (Exception e) {
                        System.out.println("Status:" + e);                        
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return result;
        }
        
        
        public ArrayList<integrate> listarIntegrate(String idProduto) throws ParseException, IOException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<integrate> result = null;
		
		conexao = criarConexao();
		result = new ArrayList<integrate>();
                
		try {
			pstmt = conexao.prepareStatement("select * from bb_bdintegrate "+
                                                         "where idprodutofk = '"+idProduto+"' ");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				integrate dados = new integrate();
				
				dados.setNomeBase(rs.getString("nomebase"));
                                dados.setIp(rs.getString("ip"));
                                dados.setPorta(rs.getString("porta"));
                                dados.setUsuarioBanco(rs.getString("usuario"));
                                dados.setSenhaBanco(rs.getString("senha"));
				result.add(dados);
			}
			
			
		} catch (Exception e) {
                        System.out.println("Status:" + e);                        
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return result;
        }
        
        
        
        
}
