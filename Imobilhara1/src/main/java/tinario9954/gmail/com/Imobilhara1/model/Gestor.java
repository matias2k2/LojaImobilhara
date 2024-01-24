package tinario9954.gmail.com.Imobilhara1.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tinario9954.gmail.com.Imobilhara1.model.chaves.GestosFk;

@Entity
@Table(name = "Gestor")
public class Gestor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idG;

    @EmbeddedId
    private GestosFk gestorFk = new GestosFk();

    // Getter e Sette da nossa classe
    public Long getIdG() {
        return idG;
    }

    public void setIdG(Long idG) {
        this.idG = idG;
    }

    public GestosFk getGestorFk() {
        return gestorFk;
    }

    public void setGestorFk(GestosFk gestorFk) {
        this.gestorFk = gestorFk;
    }

    public Gestor() {
    }
    
    //
    public Gestor(Long idG, Pedido pedido, Produto produto) {
        this.idG = idG;
        //
        this.gestorFk.setPedido(pedido);
        this.gestorFk.setProduto(produto);
    }

}
