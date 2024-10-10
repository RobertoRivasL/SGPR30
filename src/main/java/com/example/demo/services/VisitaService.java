package com.example.demo.services;

import com.example.demo.models.Visita;
import com.example.demo.repositories.IVisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitaService {

    private final IVisitaRepository visitaRepo;

    @Autowired
    public VisitaService(IVisitaRepository visitaRepo) {
        this.visitaRepo = visitaRepo;
    }

    public void crearVisita(Visita visita) {
        visitaRepo.save(visita);
    }

    public List<Visita> obtenerVisita() {

        List<Visita> visitas = visitaRepo.findAll();

        if (visitas.isEmpty()) {
            System.out.println("No hay visitas en el repositorio");
        }
        return visitas;
    }
}