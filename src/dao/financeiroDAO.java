package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import orm.ConectionDB;
import vo.financeiro;
import vo.produtos;



public class  financeiroDAO extends ConectionDB {
        
	private static financeiroDAO instance;

        
	public static financeiroDAO getInstance(){
		if(instance == null)
			instance = new financeiroDAO();
		return instance;
	}
                        

        public ArrayList<financeiro> listarFinanceiro(String idusuario) throws ParseException, IOException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<financeiro> result = null;
		
		conexao = criarConexao();
		result = new ArrayList<financeiro>();
                
		try {
			pstmt = conexao.prepareStatement("select * from c_financeiro "+
                                                         "where idusuariofk = "+idusuario+" ");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				financeiro financeiro = new financeiro();
				
				financeiro.setIdFinanceiro(rs.getString("idfinanceiro"));
                                financeiro.setIdUsuario(rs.getString("idusuariofk"));
                                financeiro.setDtVencimento(rs.getString("dtvencimento"));
                                financeiro.setBoleto(rs.getString("boleto"));
                                financeiro.setNota(rs.getString("nota"));
                                financeiro.setCodStatus(rs.getString("codstatus"));
                                financeiro.setStatus(rs.getString("status"));
				result.add(financeiro);
			}
			
		} catch (Exception e) {
                        System.out.println("Status:" + e);                        
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return result;
        }
}
