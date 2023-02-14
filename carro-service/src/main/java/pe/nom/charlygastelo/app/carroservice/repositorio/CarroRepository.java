package pe.nom.charlygastelo.app.carroservice.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.nom.charlygastelo.app.carroservice.entidades.Carro;

import java.util.List;
@Repository
public interface CarroRepository extends JpaRepository<Carro,Integer> {
    List<Carro> findByUsuarioId(int usuarioId);
}
