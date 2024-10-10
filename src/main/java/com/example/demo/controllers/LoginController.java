package com.example.demo.controllers;


import com.example.demo.services.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    private final UsuarioService usuarioService;

    public LoginController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/login")
    public String mostrarPaginaLogin() {
        return "loginView";
    }

//    @PostMapping("/formularioLogin")
//    public String postFormularioLogin(@RequestParam("nombreUsuarioLogin") String nombreUsuario,
//                                      @RequestParam("contrasenaLogin") String contrasena,
//                                      Model model){
//        boolean usuarioEncontrado = false;
//
//        for (Usuario usuario : usuarioService.obtenerUsuarios()){
//            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)){
//                usuarioEncontrado = true;
//                break;
//            }
//        }
//
//        if (usuarioEncontrado){
//            System.out.println("Bienvenido a la plataforma");
//            model.addAttribute("nombreUsuario", nombreUsuario);
//            return "index";
//        }else{
//            System.out.println("El Usuario no ha sido encontrado");
//            return "loginView";
//        }
//
//
//    }

}
