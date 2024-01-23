package tinario9954.gmail.com.Imobilhara1.model;

public class pessoa {

    private Integer Idpesso;
    private String nome;
    private String sobreNome;
    private String email;
    private String endereco;
    private String telefone;
    private String genero;
    private String dataNas;

    public Integer getIdpesso() {
        return Idpesso;
    }

    public void setIdpesso(Integer idpesso) {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
    public pessoa(Integer idpesso, String nome, String sobreNome, String email, String endereco, String telefone,
            String genero, String dataNas) {
        Idpesso = idpesso;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.dataNas = dataNas;
    }

}
