package controller;

import dao.financeiroDAO;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import vo.financeiro;



public class financeiroController {
    
        public ArrayList<financeiro> listarFinanceiro(String idusuario) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return financeiroDAO.getInstance().listarFinanceiro(idusuario);
    }
    
}
