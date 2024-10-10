package com.example.demo.controllers;


import com.example.demo.models.Visita;
import com.example.demo.services.VisitaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class VisitaController {

    private final VisitaService visitaService;

    public VisitaController(VisitaService visitaService) {
        this.visitaService = visitaService;
    }


    @GetMapping("/listaVisita")
    public String mostrarPaginaVisita(Model model) {

        List<Visita> visitas = visitaService.obtenerVisita();
        model.addAttribute("visitas", visitas);

        return "listaVisitaView";
    }


    @PostMapping("/formularioVisita")
    public String obtenerDatosPago(@RequestParam("fechaVisita") LocalDate fechaVisita,
                                   @RequestParam("nombreVisita") String nombre,
                                   @RequestParam("detalle") String detalle,
                                   Model model) {

        model.addAttribute("fechaVisita", fechaVisita);
        model.addAttribute("nombreVisita", nombre);
        model.addAttribute("detalle", detalle);

        Visita visita = new Visita(fechaVisita, nombre, detalle);

        visitaService.crearVisita(visita);

        List<Visita> visitas = visitaService.obtenerVisita();
        model.addAttribute("visitas", visitas);

        return "listaVisitaView";
    }


}
