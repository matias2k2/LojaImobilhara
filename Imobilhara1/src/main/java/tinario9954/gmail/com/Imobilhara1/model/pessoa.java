package tinario9954.gmail.com.Imobilhara1.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tinario9954.gmail.com.Imobilhara1.model.chaves.PessoaFk;

@Entity
@Table(name = "Pessoas")
public class pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long Idpesso;

    protected String nome;
    protected String sobreNome;
    protected String email;
    protected String genero;
    protected String telefone;
    protected String dataNas;
    // chaves estrageras
    @EmbeddedId
    private PessoaFk pessoaFk = new PessoaFk();

    public Long getIdpesso() {
        return Idpesso;
    }

    public void setIdpesso(Long idpesso) {
        Idpesso = idpesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataNas() {
        return dataNas;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    // Gera construtor da nossa classe
    public pessoa(Long idpesso, String nome, String sobreNome, String email, String genero, String telefone,
            String dataNas, Usuario useUsuario, Gestor gestor, Administrador admin) {

        Idpesso = idpesso;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.genero = genero;
        this.telefone = telefone;
        this.dataNas = dataNas;
        
        this.pessoaFk.setFkuser(useUsuario);
        this.pessoaFk.setAdmin(admin);
        this.pessoaFk.setGestor(gestor);
    }

}
