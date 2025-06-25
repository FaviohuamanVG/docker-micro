package vallegrande.institucion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PruebaController {

    @GetMapping("/prueba")
    public Map<String, String> obtenerDatos() {
        return Map.of(
                "id", "20462509236",
                "nombre", "Universidad Tecnologica del Perú - UTP",
                "correoContacto", "student@utp.edu.pe"
        );
    }
}
