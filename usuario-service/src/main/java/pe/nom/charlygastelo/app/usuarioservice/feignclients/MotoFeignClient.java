package pe.nom.charlygastelo.app.usuarioservice.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pe.nom.charlygastelo.app.usuarioservice.modelos.Carro;
import pe.nom.charlygastelo.app.usuarioservice.modelos.Moto;

import java.util.List;

@FeignClient(name="moto-service",url="http://localhost:8071")
@RequestMapping("/moto")
public interface MotoFeignClient {
    @PostMapping
    public Moto save(@RequestBody Moto moto);

    @GetMapping("/usuario/{usuarioId}")
    public List<Moto> getMotos(@PathVariable("usuarioId") int usuarioId);
}
