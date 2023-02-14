package pe.nom.charlygastelo.app.usuarioservice.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pe.nom.charlygastelo.app.usuarioservice.modelos.Carro;

import java.util.List;

@FeignClient(name="carro-service",url="http://localhost:8091")
@RequestMapping("/carro")
public interface CarroFeignClient {
    @PostMapping
    public Carro save(@RequestBody Carro carro);

    @GetMapping("/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);
}
