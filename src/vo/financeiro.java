package vo;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class financeiro {
    
    private String idFinanceiro;
    private String idUsuario;
    private String dtVencimento;
    private String boleto;
    private String nota;
    private String codStatus;
    private String status;
   
    
    public String getIdFinanceiro() {
            return idFinanceiro;
    }
    public void setIdFinanceiro(String idFinanceiro) {
            this.idFinanceiro = idFinanceiro;
    }
    
    
    public String getIdUsuario() {
            return idUsuario;
    }
    public void setIdUsuario(String idusuario) {
            this.idUsuario = idusuario;
    }
    
    
    public String getDtVencimento() {
            return dtVencimento;
    }
    public void setDtVencimento(String dtVencimento) {
            this.dtVencimento = dtVencimento;
    }
    
    public String getBoleto() {
            return boleto;
    }
    public void setBoleto(String boleto) {
            this.boleto = boleto;
    }
    
    
    public String getNota() {
            return nota;
    }
    public void setNota(String nota) {
            this.nota = nota;
    }
    
    
    public String getCodStatus() {
            return codStatus;
    }
    public void setCodStatus(String codStatus) {
            this.codStatus = codStatus;
    }
    
    
    public String getStatus() {
            return status;
    }
    public void setStatus(String status) {
            this.status = status;
    }
    
   
    
    @Override
    public String toString() {
            return "idfinanceiro=" + idFinanceiro + "idusuario=" + idUsuario + "dtvencimento=" + dtVencimento + "boleto" + boleto + "nota" + nota + "codstatus" + codStatus + "status" + status;
    }
    
    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((idFinanceiro == null) ? 0 : idFinanceiro.hashCode());
            result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
            result = prime * result + ((dtVencimento == null) ? 0 : dtVencimento.hashCode());
            result = prime * result + ((boleto == null) ? 0 : boleto.hashCode());
            result = prime * result + ((nota == null) ? 0 : nota.hashCode());
            result = prime * result + ((codStatus == null) ? 0 : codStatus.hashCode());
            result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        financeiro other = (financeiro) obj;
        
        
        
        if (idFinanceiro == null) {
                if (other.idFinanceiro != null)
                        return false;
        } else if (!idFinanceiro.equals(other.idFinanceiro))
                return false;
        
        
        if (idUsuario == null) {
                if (other.idUsuario != null)
                        return false;
        } else if (!idUsuario.equals(other.idUsuario))
                return false;
        
        
        if (dtVencimento == null) {
                if (other.dtVencimento != null)
                        return false;
        } else if (!dtVencimento.equals(other.dtVencimento))
                return false;
        
        
        if (boleto == null) {
                if (other.boleto != null)
                        return false;
        } else if (!boleto.equals(other.boleto))
                return false;
        
                
        if (nota == null) {
                if (other.nota != null)
                        return false;
        } else if (!nota.equals(other.nota))
                return false;
        
        
        if (codStatus == null) {
                if (other.codStatus != null)
                        return false;
        } else if (!codStatus.equals(other.codStatus))
                return false;
                
                
        if (status == null) {
                if (other.status != null)
                        return false;
        } else if (!status.equals(other.status))
                return false;
        
        
        return true;
    }
}
