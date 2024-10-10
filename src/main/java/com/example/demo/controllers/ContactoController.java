package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String mostrarPaginaContacto() {
        return "contactoView";
    }

    @PostMapping("/formularioContacto")

    public String postFormularioContacto(@RequestParam(name = "nombre") String nombre,
                                         @RequestParam(name = "correo") String correo,
                                         @RequestParam(name = "mensaje") String mensaje,
                                         Model model) {

        model.addAttribute("nombre", nombre);
        model.addAttribute("correo", correo);
        model.addAttribute("mensaje", mensaje);

        System.out.print("Nombre: " + nombre + " Correo: " + correo + " Mensaje: " + mensaje);

        return "contactoView";
    }


}
