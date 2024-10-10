package com.example.demo.controllers;

import com.example.demo.models.Capacitacion;
import com.example.demo.services.CapacitacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CapacitacionRestController {


    private final CapacitacionService capService;


    public CapacitacionRestController(CapacitacionService capService) {
        this.capService = capService;
    }

    @GetMapping("/capacitacion")
    public ResponseEntity<List<Capacitacion>> getCapacitacion() {
        List<Capacitacion> capacitacionList = capService.obtenerCapacitacion();
        return new ResponseEntity<>(capacitacionList, HttpStatus.OK);
    }

    @PostMapping("/capacitacionBody")
    public ResponseEntity<List<Capacitacion>> setCapacitacion(@RequestBody Capacitacion capacitacionRequest) {
        List<Capacitacion> capacitacionList = capService.obtenerCapacitacion();

        Capacitacion capacitacion = new Capacitacion(capacitacionRequest.getRutCliente(), capacitacionRequest.getDia(), capacitacionRequest.getHora(),
                capacitacionRequest.getLugar(), capacitacionRequest.getDuracion(), capacitacionRequest.getCantidadAsistentes());

        capacitacionList.add(capacitacion);

        return new ResponseEntity<>(capacitacionList, HttpStatus.OK);

    }
}