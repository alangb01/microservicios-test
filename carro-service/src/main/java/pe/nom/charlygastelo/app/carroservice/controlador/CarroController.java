package pe.nom.charlygastelo.app.carroservice.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.nom.charlygastelo.app.carroservice.entidades.Carro;
import pe.nom.charlygastelo.app.carroservice.service.CarroService;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public ResponseEntity<List<Carro>> listarCarros(){
        List<Carro> carros=carroService.getAll();
        if(carros.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(carros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> getUsuario(@PathVariable("id") int id){
        Carro carro = carroService.getCarroById(id);
        if(carro == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(carro);
    }

    @PostMapping
    public ResponseEntity<Carro> createUsuario(@RequestBody Carro carro){
        Carro nuevoCarro=carroService.save(carro);
        return ResponseEntity.ok(nuevoCarro);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Carro>> listarCarrosPorUsuarioId(@PathVariable("usuarioId") int id){
        List<Carro> carros=carroService.getCarrosByUsuarioId(id);
        if(carros.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(carros);
    }
}
