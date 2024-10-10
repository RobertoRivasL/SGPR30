package com.example.demo.controllers;

import com.example.demo.models.Capacitacion;
import com.example.demo.services.CapacitacionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CapacitacionController {

    private final CapacitacionService capService;

    public CapacitacionController(CapacitacionService capService) {
        this.capService = capService;
    }

    @GetMapping("/crearCapacitacion")
    public String mostrarPaginaCapacitacion() {
        return "crearCapacitacionView";
    }

    @GetMapping("/listaCapacitacion")
    public String mostrarPaginaListaCapacitacion(Model model) {
        List<Capacitacion> capacitaciones = capService.obtenerCapacitacion();
        model.addAttribute("capacitaciones", capacitaciones);
        return "listaCapacitacionView";
    }

    @PostMapping("/formularioCapacitacion")

    public String postFormularioCapacitacion(@RequestParam("rutCliente") String rutCliente,
                                             @RequestParam("dia") String dia,
                                             @RequestParam("hora") String hora,
                                             @RequestParam("lugar") String lugar,
                                             @RequestParam("duracion") String duracion,
                                             @RequestParam("cantidadAsistentes") String cantidadAsistentes,
                                             Model model) {

        model.addAttribute("rutCliente", rutCliente);
        model.addAttribute("dia", dia);
        model.addAttribute("hora", hora);
        model.addAttribute("lugar", lugar);
        model.addAttribute("duracion", duracion);
        model.addAttribute("cantidadAsistentes", cantidadAsistentes);

        Capacitacion capacitacion = new Capacitacion(rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
        capService.crearCapacitacion(capacitacion);

        return "crearCapacitacionView";
    }


}
