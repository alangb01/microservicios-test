package pe.nom.charlygastelo.app.motoservice.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.nom.charlygastelo.app.motoservice.entidades.Moto;
import pe.nom.charlygastelo.app.motoservice.repositorio.MotoRepository;

import java.util.List;

@Service
public class MotoService {
    @Autowired
    private MotoRepository motoRepository;

    public List<Moto> getAll(){
        return motoRepository.findAll();
    }

    public Moto getMotoById(int id){
        return motoRepository.findById(id).orElse(null);
    }

    public Moto save(Moto moto){
        Moto motoNueva= motoRepository.save(moto);
        return motoNueva;
    }

    public List<Moto> getMotosByUsuarioId(int id){
        return motoRepository.findByUsuarioId(id);
    }
}
