package controller;

import java.util.ArrayList;
import dao.licencaDAO;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import vo.licenca;



public class licencaController {
    
    public ArrayList<licenca> listarLicenca(String idproduto) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return licencaDAO.getInstance().listarLicenca(idproduto);
    }
    
    public String validaLicenca(String user,String senha) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return licencaDAO.getInstance().validaLicenca(user,senha);
    }
    
    public String setLicenca(String token,String usuario) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return licencaDAO.getInstance().setLicenca(token,usuario);
    }
    
    public String validaToken(String token,String usuario) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return licencaDAO.getInstance().validaToken(token,usuario);
    }
    
}
