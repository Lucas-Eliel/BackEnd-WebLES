package vo;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class adm {
    
    private String idAdm;
    private String idUsuario;
    private String contrato;
   
    
    public String getIdAdm() {
            return idAdm;
    }
    public void setIdAdm(String idAdm) {
            this.idAdm = idAdm;
    }
    
    
    public String getIdUsuario() {
            return idUsuario;
    }
    public void setIdUsuario(String idusuario) {
            this.idUsuario = idusuario;
    }
    
    
    public String getContrato() {
            return contrato;
    }
    public void setContrato(String contrato) {
            this.contrato = contrato;
    }
  
   
    
    @Override
    public String toString() {
            return "idadm=" + idAdm + "idusuario=" + idUsuario + "contrato" + contrato;
    }
    
    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((idAdm == null) ? 0 : idAdm.hashCode());
            result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
            result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
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
        adm other = (adm) obj;
        
        
        
        if (idAdm == null) {
                if (other.idAdm != null)
                        return false;
        } else if (!idAdm.equals(other.idAdm))
                return false;
        
        
        if (idUsuario == null) {
                if (other.idUsuario != null)
                        return false;
        } else if (!idUsuario.equals(other.idUsuario))
                return false;
        
        
        if (contrato == null) {
                if (other.contrato != null)
                        return false;
        } else if (!contrato.equals(other.contrato))
                return false;

        
        return true;
    }
}
