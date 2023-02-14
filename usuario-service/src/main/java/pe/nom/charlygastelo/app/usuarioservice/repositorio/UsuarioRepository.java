package pe.nom.charlygastelo.app.usuarioservice.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.nom.charlygastelo.app.usuarioservice.entidades.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
