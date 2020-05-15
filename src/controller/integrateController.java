package controller;

import dao.admDAO;
import dao.financeiroDAO;
import dao.integrateDAO;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import vo.adm;
import vo.integrate;



public class integrateController {
    
    public ArrayList<integrate> gravarIntegrate(integrate dadosIntegrate) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return integrateDAO.getInstance().gravarIntegrate((integrate)dadosIntegrate);
    }
        
    public ArrayList<integrate> listarIntegrate(String idproduto) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return integrateDAO.getInstance().listarIntegrate(idproduto);
    }
    
}
