package controller;

import dao.licencaDAO;
import dao.produtoDAO;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import vo.produtos;


public class produtosController {
    
    public ArrayList<produtos> listarProdutos(String idusuario) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return produtoDAO.getInstance().listarProdutos(idusuario);
    }
    
    public ArrayList<produtos> listarProdutoSelecionado(String idproduto) throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return produtoDAO.getInstance().listarProdutoSelecionado(idproduto);
    }
        
    public ArrayList<produtos> listarProdutos() throws ParseException, IOException{
        System.out.println("Enviando para o GIT");
        return produtoDAO.getInstance().listarProdutos();
    }
    
}
