package tinario9954.gmail.com.Imobilhara1.model.chaves;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import tinario9954.gmail.com.Imobilhara1.model.Pedido;
import tinario9954.gmail.com.Imobilhara1.model.Usuario;

// Usamo quando um tipo repezenta dois campos 
@Embeddable
public class PedidoPk {

    @ManyToOne
    @JoinColumn(name="fkPedido")
    protected Pedido pedido;
    @ManyToOne
    @JoinColumn(name="fkUsuario")
    protected Usuario usuario;

    //Pedido da minha classe 
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Metodos Contrutor da nossa classe
    public PedidoPk()
    {
        
    }

    public PedidoPk(Pedido pedido, Usuario usuario) {
        this.pedido = pedido;
        this.usuario = usuario;
    }

    // Nosso metodo Equal para compara as nossa classe 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
        result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
        PedidoPk other = (PedidoPk) obj;
        if (pedido == null) {
            if (other.pedido != null)
                return false;
        } else if (!pedido.equals(other.pedido))
            return false;
        if (usuario == null) {
            if (other.usuario != null)
                return false;
        } else if (!usuario.equals(other.usuario))
            return false;
        return true;
    }

    



}
