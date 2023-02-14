package pe.nom.charlygastelo.app.carroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pe.nom.charlygastelo.app.carroservice.entidades.Carro;
import pe.nom.charlygastelo.app.carroservice.repositorio.CarroRepository;

import java.util.List;

@Service
public class CarroService {
    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> getAll(){
        return carroRepository.findAll();
    }

    public Carro getCarroById(int id){
        return carroRepository.findById(id).orElse(null);
    }

    public Carro save(Carro carro){
        Carro carroNuevo=carroRepository.save(carro);
        return carroNuevo;
    }

    public List<Carro> getCarrosByUsuarioId(int id){
        return carroRepository.findByUsuarioId(id);
    }
}
