package controller;

import dao.admDAO;
import dao.financeiroDAO;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import vo.adm;



public class admController {
    
        public ArrayList<adm> listarAdm(String idusuario) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return admDAO.getInstance().listarAdm(idusuario);
    }
    
}
