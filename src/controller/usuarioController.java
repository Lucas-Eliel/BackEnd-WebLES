package controller;

import dao.financeiroDAO;
import dao.usuarioDAO;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import vo.financeiro;
import vo.usuario;


public class usuarioController {

    public String validaUsuario(String user,String senha) throws ParseException, IOException, org.json.simple.parser.ParseException{
        System.out.println("Enviando para o GIT");
        return usuarioDAO.getInstance().validaUsuario(user,senha);
    }
        
    public ArrayList<usuario> listarUsuario(String nome) throws org.json.simple.parser.ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return usuarioDAO.getInstance().listarUsuario(nome);
    }
}
