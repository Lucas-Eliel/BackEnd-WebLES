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
import vo.produtos;



public class  admDAO extends ConectionDB {
        
	private static admDAO instance;

        
	public static admDAO getInstance(){
		if(instance == null)
			instance = new admDAO();
		return instance;
	}
                        

        public ArrayList<adm> listarAdm(String idusuario) throws ParseException, IOException{
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<adm> result = null;
		
		conexao = criarConexao();
		result = new ArrayList<adm>();
                
		try {
			pstmt = conexao.prepareStatement("select * from d_adm "+
                                                         "where idusuariofk = "+idusuario+" ");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				adm adm = new adm();
				
				adm.setIdAdm(rs.getString("idadm"));
                                adm.setIdUsuario(rs.getString("idusuariofk"));
                                adm.setContrato(rs.getString("contrato"));
				result.add(adm);
			}
			
		} catch (Exception e) {
                        System.out.println("Status:" + e);                        
		} finally {
			fecharConexao(conexao, pstmt, rs);
		}
		return result;
        }
}
