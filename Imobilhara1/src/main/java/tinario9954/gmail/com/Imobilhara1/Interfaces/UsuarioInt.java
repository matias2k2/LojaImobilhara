package tinario9954.gmail.com.Imobilhara1.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tinario9954.gmail.com.Imobilhara1.model.Usuario;
import tinario9954.gmail.com.Imobilhara1.model.tipoUser;

public interface UsuarioInt extends JpaRepository<Usuario, Integer> {

    @Query(value = "select * from usuario  where email = :email and senha = :senha", nativeQuery = true)
    public Usuario Login(String email, String senha);

    @Query(value= "INSERT INTO Usuario (email, nome, senha) VALUES (?, ?, ?)",nativeQuery = true)
    public Usuario validar(String nome,String email ,String senha);

    @Query(value="INSERT INTO tiposUser (descricao) values(?)",nativeQuery = true)
    public tipoUser inserirTipoUsuario(String descricao);
    
}
