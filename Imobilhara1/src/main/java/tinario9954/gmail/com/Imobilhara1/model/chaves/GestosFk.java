package tinario9954.gmail.com.Imobilhara1.model.chaves;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import tinario9954.gmail.com.Imobilhara1.model.Pedido;
import tinario9954.gmail.com.Imobilhara1.model.Produto;

@Embeddable
public class GestosFk {
    @ManyToOne
    @JoinColumn(name = "fkpedidos")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "fkprodutos")
    private Produto produto;

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

    //Contrutor da nossa classe 
    public GestosFk()
    {
        
    }
    public GestosFk(Pedido pedido, Produto produto) {
        this.pedido = pedido;
        this.produto = produto;
    }

    // Tabela de Hast code 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
        result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
        GestosFk other = (GestosFk) obj;
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
        return true;
    }
    
    
}
