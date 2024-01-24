package tinario9954.gmail.com.Imobilhara1.model.chaves;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import tinario9954.gmail.com.Imobilhara1.model.Administrador;
import tinario9954.gmail.com.Imobilhara1.model.Gestor;
import tinario9954.gmail.com.Imobilhara1.model.Usuario;

@Embeddable
public class PessoaFk {

    @ManyToOne
    @JoinColumn(name = "fkuser")
    protected Usuario fkuser;
    @ManyToOne
    @JoinColumn(name = "fkgestor")
    protected Gestor gestor;
    @ManyToOne
    @JoinColumn(name = "fkadmin")
    protected Administrador admin;

    // Getter e Setter
    public Usuario getFkuser() {
        return fkuser;
    }

    public void setFkuser(Usuario fkuser) {
        this.fkuser = fkuser;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    // Contrutor da nossa classe
    public PessoaFk() {

    }

    public PessoaFk(Usuario fkuser, Gestor gestor, Administrador admin) {
        this.fkuser = fkuser;
        this.gestor = gestor;
        this.admin = admin;
    }

}
