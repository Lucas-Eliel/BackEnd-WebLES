package vo;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class produtos {
    
    private String idProduto;
    private String idUsuario;
    private String nome;
    private String modelo;
    private String versao;
    private String logo;
    private String download;
   
    
    public String getIdProduto() {
            return idProduto;
    }
    public void setIdProduto(String idProduto) {
            this.idProduto = idProduto;
    }
    
    
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
    
    
    public String getModelo() {
            return modelo;
    }
    public void setModelo(String modelo) {
            this.modelo = modelo;
    }
    
    
    public String getVersao() {
            return versao;
    }
    public void setVersao(String versao) {
            this.versao = versao;
    }
    
    
    public String getLogo() {
            return logo;
    }
    public void setLogo(String logo) {
            this.logo = logo;
    }
    
    
    public String getDownload() {
            return download;
    }
    public void setDownload(String download) {
            this.download = download;
    }
    
   
    
    @Override
    public String toString() {
            return "idproduto=" + idProduto + "idusuario=" + idUsuario + "nome" + nome + "modelo" + modelo + "versao" + versao + "logo" + logo + "download" + download;
    }
    
    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((idProduto == null) ? 0 : idProduto.hashCode());
            result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
            result = prime * result + ((versao == null) ? 0 : versao.hashCode());
            result = prime * result + ((logo == null) ? 0 : logo.hashCode());
            result = prime * result + ((download == null) ? 0 : download.hashCode());
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
        produtos other = (produtos) obj;
        
        
        
        if (idProduto == null) {
                if (other.idProduto != null)
                        return false;
        } else if (!idProduto.equals(other.idProduto))
                return false;
        
        
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
        
                
        if (modelo == null) {
                if (other.modelo != null)
                        return false;
        } else if (!modelo.equals(other.modelo))
                return false;
        
        
        if (versao == null) {
                if (other.versao != null)
                        return false;
        } else if (!versao.equals(other.versao))
                return false;
                
                
        if (logo == null) {
                if (other.logo != null)
                        return false;
        } else if (!logo.equals(other.logo))
                return false;
        
        if (download == null) {
                if (other.download != null)
                        return false;
        } else if (!download.equals(other.download))
                return false;
        
        
        return true;
    }
}
