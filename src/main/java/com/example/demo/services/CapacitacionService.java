package com.example.demo.services;

import com.example.demo.models.Capacitacion;
import com.example.demo.repositories.ICapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapacitacionService {

    private final ICapacitacionRepository capRepo;

    @Autowired
    public CapacitacionService(ICapacitacionRepository capRepo) {
        this.capRepo = capRepo;
    }

    public void crearCapacitacion(Capacitacion capacitacion) {
        capRepo.save(capacitacion);
    }

    public List<Capacitacion> obtenerCapacitacion() {

        List<Capacitacion> capacitaciones = capRepo.findAll();

        if (capacitaciones.isEmpty()) {
            System.out.println("No hay capacitaciones en el repositorio");
        }
        return capacitaciones;


    }


}
