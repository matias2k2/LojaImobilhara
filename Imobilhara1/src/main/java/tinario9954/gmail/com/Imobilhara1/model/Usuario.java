package tinario9954.gmail.com.Imobilhara1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuarios")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUs;
    private String senha;

    private Gestor gestor;
    private Clientes clientes;
    private Administrador administrador;
    
    public Long getIdUs() {
        return idUs;
    }
    public void setIdUs(Long idUs) {
        this.idUs = idUs;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Gestor getGestor() {
        return gestor;
    }
    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
    public Clientes getClientes() {
        return clientes;
    }
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public Administrador getAdministrador() {
        return administrador;
    }
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
}
