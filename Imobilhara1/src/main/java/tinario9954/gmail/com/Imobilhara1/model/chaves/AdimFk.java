package tinario9954.gmail.com.Imobilhara1.model.chaves;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import tinario9954.gmail.com.Imobilhara1.model.Clientes;
import tinario9954.gmail.com.Imobilhara1.model.Gestor;
import tinario9954.gmail.com.Imobilhara1.model.Pedido;
import tinario9954.gmail.com.Imobilhara1.model.Produto;

@Embeddable
public class AdimFk {

    @ManyToOne
    @JoinColumn(name = "Fkpedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "Fkproduto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "Fkcliente")
    private Clientes clientes;

    @ManyToOne
    @JoinColumn(name = "Fkgestor")
    private Gestor gestor;

    // Construtor da nossa classe
    public AdimFk() {

    }

    // Getter e Setter
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
    // Contrutor da

    public AdimFk(Pedido pedido , Produto produto, Clientes clientes, Gestor gestor) {
        
        this.pedido = pedido;
        this.produto = produto;
        this.clientes = clientes;
        this.gestor = gestor;

    }
    // Nosso metodo Equal para compara as nossa classe

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
        result = prime * result + ((produto == null) ? 0 : produto.hashCode());
        result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
        result = prime * result + ((gestor == null) ? 0 : gestor.hashCode());
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
        AdimFk other = (AdimFk) obj;
        if (pedido == null) {
            if (other.pedido != null)
                return false;
        } else if (!pedido.equals(other.pedido))
            return false;
        if (produto == null) {
            if (other.produto != null)
                return false;
        } else if (!produto.equals(other.produto))
            return false;
        if (clientes == null) {
            if (other.clientes != null)
                return false;
        } else if (!clientes.equals(other.clientes))
            return false;
        if (gestor == null) {
            if (other.gestor != null)
                return false;
        } else if (!gestor.equals(other.gestor))
            return false;
        return true;
    }
    

}
