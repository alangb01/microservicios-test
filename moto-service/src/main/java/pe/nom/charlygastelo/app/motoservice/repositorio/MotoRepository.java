package pe.nom.charlygastelo.app.motoservice.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.nom.charlygastelo.app.motoservice.entidades.Moto;

import java.util.List;
@Repository
public interface MotoRepository extends JpaRepository<Moto,Integer> {
    List<Moto> findByUsuarioId(int usuarioId);
}
