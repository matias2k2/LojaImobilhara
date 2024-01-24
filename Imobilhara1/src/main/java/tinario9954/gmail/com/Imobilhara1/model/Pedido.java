package tinario9954.gmail.com.Imobilhara1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private String dataPedido;
    private int quanPedido;

    // gette e setter da nossa classe

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getQuanPedido() {
        return quanPedido;
    }

    public void setQuanPedido(int quanPedido) {
        this.quanPedido = quanPedido;
    }

    // Fim Metodo getter e Setter

}
