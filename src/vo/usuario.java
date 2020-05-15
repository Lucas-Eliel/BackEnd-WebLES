package vo;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class usuario {
    
    private String idUsuario;
    private String nome;
    private String dtCadastro;
    private String bairro;
    private String rua;
    private String numero;
    private String cidade;
    private String cep;
    private String email;
    private String cpfcnpj;
    private String telefone;
    private String celular;
    private String obs;
   
    
    public String getIdUsuario() {
            return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
            this.idUsuario = idUsuario;
    }
    
    
    public String getNome() {
            return nome;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }
    
    
    public String getDtCadastro() {
            return dtCadastro;
    }
    public void setDtCadastro(String dtCadastro) {
            this.dtCadastro = dtCadastro;
    }
    
    
    public String getBairro() {
            return bairro;
    }
    public void setBairro(String bairro) {
            this.bairro = bairro;
    }
    
    
    public String getRua() {
            return rua;
    }
    public void setRua(String rua) {
            this.rua = rua;
    }
    
    
    public String getNumero() {
            return numero;
    }
    public void setNumero(String numero) {
            this.numero = numero;
    }
    
    
    public String getCidade() {
            return cidade;
    }
    public void setCidade(String cidade) {
            this.cidade = cidade;
    }
    

    public String getCep() {
            return cep;
    }
    public void setCep(String cep) {
            this.cep = cep;
    }
    

    public String getEmail() {
            return email;
    }
    public void setEmail(String email) {
            this.email = email;
    }
    
    
    public String getCpfCnpj() {
            return cpfcnpj;
    }
    public void setCpfCnpj(String cpfcnpj) {
            this.cpfcnpj = cpfcnpj;
    }
    

    public String getTelefone() {
            return telefone;
    }
    public void setTelefone (String telefone) {
            this.telefone = telefone;
    }
    
    
    public String getCelular() {
            return celular;
    }
    public void setCelular (String celular) {
            this.celular = celular;
    }
    
    
    public String getObs() {
            return obs;
    }
    public void setObs (String obs) {
            this.obs = obs;
    }
    
    
    
    
    
    @Override
    public String toString() {
            return "idusuario=" + idUsuario + "nome=" + nome + "dtcadastro" + dtCadastro + "bairro" + bairro + "rua" + rua + "numero" + numero + "cidade" + cidade + "cep" + cep + "email" + email + "cpfcnpj" + cpfcnpj + "telefone" + telefone + "celular" + celular + "obs" + obs;
    }
    
    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((dtCadastro == null) ? 0 : dtCadastro.hashCode());
            result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
            result = prime * result + ((rua == null) ? 0 : rua.hashCode());
            result = prime * result + ((numero == null) ? 0 : numero.hashCode());
            result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
            result = prime * result + ((cep == null) ? 0 : cep.hashCode());
            result = prime * result + ((email == null) ? 0 : email.hashCode());
            result = prime * result + ((cpfcnpj == null) ? 0 : cpfcnpj.hashCode());
            result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
            result = prime * result + ((celular == null) ? 0 : celular.hashCode());
            result = prime * result + ((obs == null) ? 0 : obs.hashCode());
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
        usuario other = (usuario) obj;
        
        
        
        if (idUsuario == null) {
                if (other.idUsuario != null)
                        return false;
        } else if (!idUsuario.equals(other.idUsuario))
                return false;
        
        
        if (nome == null) {
                if (other.nome != null)
                        return false;
        } else if (!nome.equals(other.nome))
                return false;
        
        
        if (dtCadastro == null) {
                if (other.dtCadastro != null)
                        return false;
        } else if (!dtCadastro.equals(other.dtCadastro))
                return false;
        
                
        if (bairro == null) {
                if (other.bairro != null)
                        return false;
        } else if (!bairro.equals(other.bairro))
                return false;
        
        
        if (rua == null) {
                if (other.rua != null)
                        return false;
        } else if (!rua.equals(other.rua))
                return false;
                
                
        if (numero == null) {
                if (other.numero != null)
                        return false;
        } else if (!numero.equals(other.numero))
                return false;
        
        
                
        if (cidade == null) {
                if (other.cidade != null)
                        return false;
        } else if (!cidade.equals(other.cidade))
                return false;
        
        
        if (cep == null) {
                if (other.cep != null)
                        return false;
        } else if (!cep.equals(other.cep))
                return false;
        
        
        if (email == null) {
                if (other.email != null)
                        return false;
        } else if (!email.equals(other.email))
                return false;
        
                
        if (cpfcnpj == null) {
                if (other.cpfcnpj != null)
                        return false;
        } else if (!cpfcnpj.equals(other.cpfcnpj))
                return false;
        
        
        if (telefone == null) {
                if (other.telefone != null)
                        return false;
        } else if (!telefone.equals(other.telefone))
                return false;
                
                
        if (celular == null) {
                if (other.celular != null)
                        return false;
        } else if (!celular.equals(other.celular))
                return false;
        
        
        if (obs == null) {
                if (other.obs != null)
                        return false;
        } else if (!obs.equals(other.obs))
                return false;
        
        
        return true;
    }
}
