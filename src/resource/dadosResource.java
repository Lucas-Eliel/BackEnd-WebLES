package resource;


import com.google.gson.Gson;
import controller.admController;
import controller.financeiroController;
import controller.integrateController;
import controller.usuarioController;
import java.io.IOException;
import java.util.ArrayList;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.json.simple.parser.ParseException;
import controller.licencaController;
import controller.produtosController;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import orm.ConectionDB;
import sam.vo.scn.Db10;
import vo.adm;
import vo.financeiro;
import vo.integrate;
import vo.licenca;
import vo.produtos;
import vo.usuario;
        
        
        
    @Path("/dados")
    public class dadosResource {
        
    @POST
    @Path("/gravarIntegrate")
    @Consumes("application/json")
    public String gravarIntegrate(String dadosIntegrate) throws IOException, Exception{
        Gson gson = new Gson();
        integrate intg = (integrate) gson.fromJson(dadosIntegrate, integrate.class);
        new integrateController().gravarIntegrate((integrate) intg);
        return "true";
    }
        
    @GET
    @Path("/validaLicenca/{user}/{senha}")
    @Produces("application/json")
    public String validaLicenca(@PathParam("user") String user,@PathParam("senha") String senha) throws ParseException, IOException, org.json.simple.parser.ParseException, java.text.ParseException{
        return new licencaController().validaLicenca(user,senha);
    }
    
    @GET
    @Path("/validaUsuario/{user}/{senha}")
    @Produces("application/json")
    public String validaUsuario(@PathParam("user") String user,@PathParam("senha") String senha) throws ParseException, IOException, org.json.simple.parser.ParseException, java.text.ParseException{
        return new usuarioController().validaUsuario(user,senha);
    }
    
    @GET
    @Path("/listarLicenca/{idproduto}")
    @Produces("application/json")
    public ArrayList<licenca> listarLicenca(@PathParam("idproduto") String idproduto) throws ParseException, IOException{
        return new licencaController().listarLicenca(idproduto);        
    }
    
    @GET
    @Path("/listarIntegrate/{idproduto}")
    @Produces("application/json")
    public ArrayList<integrate> listarIntegrate(@PathParam("idproduto") String idproduto) throws ParseException, IOException{
        return new integrateController().listarIntegrate(idproduto);        
    }
    
    @GET
    @Path("/listarUsuario/{nome}")
    @Produces("application/json")
    public ArrayList<usuario> listarUsuarios(@PathParam("nome") String nome) throws ParseException, IOException{
        return new usuarioController().listarUsuario(nome);        
    }
    
    
    @GET
    @Path("/listarProdutos/{idusuario}")
    @Produces("application/json")
    public ArrayList<produtos> listarProdutos(@PathParam("idusuario") String idusuario) throws ParseException, IOException{
        return new produtosController().listarProdutos(idusuario);        
    }
    
    @GET
    @Path("/listarProdutoSelecionado/{idproduto}")
    @Produces("application/json")
    public ArrayList<produtos> listarProdutoSelecionado(@PathParam("idproduto") String idproduto) throws ParseException, IOException{
        return new produtosController().listarProdutoSelecionado(idproduto);        
    }
    
    @GET
    @Path("/listarProdutos")
    @Produces("application/json")
    public ArrayList<produtos> listarProdutos() throws ParseException, IOException{
        return new produtosController().listarProdutos();        
    }
    
    
    
    @GET
    @Path("/listarFinanceiro/{idusuario}")
    @Produces("application/json")
    public ArrayList<financeiro> listarFinanceiro(@PathParam("idusuario") String idusuario) throws ParseException, IOException{
        return new financeiroController().listarFinanceiro(idusuario);        
    }
    
    @GET
    @Path("/listarAdm/{idusuario}")
    @Produces("application/json")
    public ArrayList<adm> listarAdm(@PathParam("idusuario") String idusuario) throws ParseException, IOException{
        return new admController().listarAdm(idusuario);        
    }
    
    @GET
    @Path("/setLicenca/{token}/{usuario}")
    @Produces("application/json")
    public String setLicenca(@PathParam("token") String token,@PathParam("usuario") String usuario) throws ParseException, IOException, org.json.simple.parser.ParseException, java.text.ParseException{
        return new licencaController().setLicenca(token,usuario);
    }
    
    @GET
    @Path("/validaToken/{token}/{usuario}")
    @Produces("application/json")
    public String validaToken(@PathParam("token") String token,@PathParam("usuario") String usuario) throws ParseException, IOException, org.json.simple.parser.ParseException, java.text.ParseException{
        return new licencaController().validaToken(token,usuario);
    }
    
}
