package pe.nom.charlygastelo.app.motoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.nom.charlygastelo.app.motoservice.entidades.Moto;
import pe.nom.charlygastelo.app.motoservice.servicio.MotoService;

import java.util.List;

@RestController
@RequestMapping("/moto")
public class MotoController {

    @Autowired
    private MotoService motoService;

    @GetMapping
    public ResponseEntity<List<Moto>> listarMotos(){
        List<Moto> motos= motoService.getAll();
        if(motos.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(motos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Moto> getUsuario(@PathVariable("id") int id){
        Moto moto = motoService.getMotoById(id);
        if(moto == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(moto);
    }

    @PostMapping
    public ResponseEntity<Moto> createMoto(@RequestBody Moto carro){
        Moto nuevoCarro= motoService.save(carro);
        return ResponseEntity.ok(nuevoCarro);
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Moto>> listarMotosPorUsuarioId(@PathVariable("usuarioId") int id){
        List<Moto> motos= motoService.getMotosByUsuarioId(id);
        if(motos.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(motos);
    }
}
