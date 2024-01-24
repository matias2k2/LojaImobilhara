package tinario9954.gmail.com.Imobilhara1.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tinario9954.gmail.com.Imobilhara1.model.chaves.AdimFk;

@Entity
@Table(name="Administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAdmin;
    
    //CHaves estragera
    @EmbeddedId
    private AdimFk fkAdim= new AdimFk();

    // Gette e setter da nossa classe 
    public Long getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(Long idAdmin) {
        IdAdmin = idAdmin;
    }

    public AdimFk getFkAdim() {
        return fkAdim;
    }

    public void setFkAdim(AdimFk fkAdim) {
        this.fkAdim = fkAdim;
    }
    
    //Contrutor 
    public Administrador(Long idAdmin, Pedido pedido, Produto produto,Gestor gestor,Clientes cliente) {
        IdAdmin = idAdmin;
        // Getter e Setter 
        this.fkAdim.setPedido(pedido);
        this.fkAdim.setProduto(produto);
        this.fkAdim.setGestor(gestor);
        this.fkAdim.setClientes(cliente);
        //fIM DA Chaves estragera
    }

    // Tabele de hastCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((IdAdmin == null) ? 0 : IdAdmin.hashCode());
        result = prime * result + ((fkAdim == null) ? 0 : fkAdim.hashCode());
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
        Administrador other = (Administrador) obj;
        if (IdAdmin == null) {
            if (other.IdAdmin != null)
                return false;
        } else if (!IdAdmin.equals(other.IdAdmin))
            return false;
        if (fkAdim == null) {
            if (other.fkAdim != null)
                return false;
        } else if (!fkAdim.equals(other.fkAdim))
            return false;
        return true;
    }

    

    


    
}
