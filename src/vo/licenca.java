package vo;

import javax.xml.bind.annotation.XmlRootElement;
import org.json.simple.parser.ParseException;



@XmlRootElement
public class licenca {
    
    private String licenca;
    private String usuario;
    private String token;
   
    
    public String getLicenca() {
            return licenca;
    }
    public void setLicenca(String licenca) {
            this.licenca = licenca;
    }
    public String getUsuario() {
            return usuario;
    }
    public void setUsuario(String usuario) {
            this.usuario = usuario;
    }
    public String getToken() {
            return token;
    }
    public void setToken(String token) {
            this.token = token;
    }

    
    @Override
    public String toString() {
            return "licenca=" + licenca + "usuario=" + usuario + "token" + token;
    }
    
    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((licenca == null) ? 0 : licenca.hashCode());
            result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
            result = prime * result + ((token == null) ? 0 : token.hashCode());
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
        licenca other = (licenca) obj;
        if (licenca == null) {
                if (other.licenca != null)
                        return false;
        } else if (!licenca.equals(other.licenca))
                return false;
        if (usuario == null) {
                if (other.usuario != null)
                        return false;
        } else if (!usuario.equals(other.usuario))
                return false;
        if (token == null) {
                if (other.token != null)
                        return false;
        } else if (!token.equals(other.token))
                return false;
        
        return true;
    }
}
