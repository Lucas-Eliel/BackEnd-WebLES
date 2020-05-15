package vo;

import javax.xml.bind.annotation.XmlRootElement;
import org.json.simple.parser.ParseException;


@XmlRootElement
public class integrate {
    
    private String idProduto;
    private String nomeBase;
    private String ip;
    private String porta;
    private String usuarioBanco;
    private String senhaBanco;
   
    
    public String getIdProduto() {
            return idProduto;
    }
    public void setIdProduto(String idProduto) {
            this.idProduto = idProduto;
    }
    
    
    public String getNomeBase() {
            return nomeBase;
    }
    public void setNomeBase(String nomeBase) {
            this.nomeBase = nomeBase;
    }
    
    
    public String getIp() {
            return ip;
    }
    public void setIp(String ip) {
            this.ip = ip;
    }
    
    
    public String getPorta() {
            return porta;
    }
    public void setPorta(String porta) {
            this.porta = porta;
    }
    
    
    public String getUsuarioBanco() {
            return usuarioBanco;
    }
    public void setUsuarioBanco(String usuarioBanco) {
            this.usuarioBanco = usuarioBanco;
    }
    
    
    public String getSenhaBanco() {
            return senhaBanco;
    }
    public void setSenhaBanco(String senhaBanco) {
            this.senhaBanco = senhaBanco;
    }
    
    @Override
    public String toString() {
            return "idProduto=" + idProduto + "nomeBase=" + nomeBase + "ip=" + ip + "porta" + porta + "usuarioBanco=" + usuarioBanco + "senhaBanco" + senhaBanco;
    }
    
    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((idProduto == null) ? 0 : idProduto.hashCode());
            result = prime * result + ((nomeBase == null) ? 0 : nomeBase.hashCode());
            result = prime * result + ((ip == null) ? 0 : ip.hashCode());
            result = prime * result + ((porta == null) ? 0 : porta.hashCode());
            result = prime * result + ((usuarioBanco == null) ? 0 : usuarioBanco.hashCode());
            result = prime * result + ((senhaBanco == null) ? 0 : senhaBanco.hashCode());
            return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj)
                return true;
        if (obj == null)
                return false;
        if (getClass() != obj.getClass())
                return false;
        integrate other = (integrate) obj;
        
        
        
        if (idProduto == null) {
                if (other.idProduto != null)
                        return false;
        } else if (!idProduto.equals(other.idProduto))
                return false;
        
        
        if (nomeBase == null) {
                if (other.nomeBase != null)
                        return false;
        } else if (!nomeBase.equals(other.nomeBase))
                return false;
        
        
        if (ip == null) {
                if (other.ip != null)
                        return false;
        } else if (!ip.equals(other.ip))
                return false;
        
        
        if (porta == null) {
                if (other.porta != null)
                        return false;
        } else if (!porta.equals(other.porta))
                return false;
                
        
        if (usuarioBanco == null) {
                if (other.usuarioBanco != null)
                        return false;
        } else if (!usuarioBanco.equals(other.usuarioBanco))
                return false;
        
        
        if (senhaBanco == null) {
                if (other.senhaBanco != null)
                        return false;
        } else if (!senhaBanco.equals(other.senhaBanco))
                return false;
        
        return true;
    }
}
