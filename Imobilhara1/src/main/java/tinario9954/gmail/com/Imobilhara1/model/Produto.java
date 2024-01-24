package tinario9954.gmail.com.Imobilhara1.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tinario9954.gmail.com.Imobilhara1.model.chaves.PedidoPk;

@Entity
@Table(name = "Produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idP;
    protected String nomeProduto;
    protected float preco;
    // Usamos quando chamos um tipo EmbeddedId QUE quarda duas chaves
    @EmbeddedId
    protected PedidoPk fkpedido = new PedidoPk();

    // Contrutor da nossa classe
    public Produto() {

    }

    public Produto(Integer idP, String nomeProduto, float preco, Usuario usuario, Pedido pedido) {
        // Aqui estou a passar as chaves por prametro
        this.fkpedido.setPedido(pedido);
        this.fkpedido.setUsuario(usuario);
        // Fim chaves
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    // Fim do noasso construtor
    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public PedidoPk getFkpedido() {
        return fkpedido;
    }

    public void setFkpedido(PedidoPk fkpedido) {
        this.fkpedido = fkpedido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idP == null) ? 0 : idP.hashCode());
        result = prime * result + ((fkpedido == null) ? 0 : fkpedido.hashCode());
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
        Produto other = (Produto) obj;
        if (idP == null) {
            if (other.idP != null)
                return false;
        } else if (!idP.equals(other.idP))
            return false;
        if (fkpedido == null) {
            if (other.fkpedido != null)
                return false;
        } else if (!fkpedido.equals(other.fkpedido))
            return false;
        return true;
    }

}
