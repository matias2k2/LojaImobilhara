package tinario9954.gmail.com.Imobilhara1.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tinario9954.gmail.com.Imobilhara1.model.Usuario;

public interface UsuarioInt extends JpaRepository<Usuario, Integer> {

    @Query(value = "select * from pessoas where email = :email and senha = :senha", nativeQuery = true)
    public Usuario Login(String email, String senha);
    
}
