package com.example.demo.controllers;

import com.example.demo.models.Authority;
import com.example.demo.models.Usuario;
import com.example.demo.repositories.IAuthorityRepository;
import com.example.demo.services.UsuarioService;
import com.example.demo.utils.AuthorityName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final IAuthorityRepository authorityRepository;


    public UsuarioController(UsuarioService usuarioService, IAuthorityRepository authorityRepository) {
        this.usuarioService = usuarioService;
        this.authorityRepository = authorityRepository;
    }

    @GetMapping("/crearUsuario")
    public String mostrarPaginaRegistro() {
        return "crearUsuarioView";
    }

    @GetMapping("/editarUsuario")
    public String mostrarEditarUsuario() {
        return "editUsuarioView";
    }

    @GetMapping("/listaUsuarios")
    public String mostrarPaginaListaUsuarios(Model model) {

        List<Usuario> usuarios = usuarioService.obtenerUsuarios();
        model.addAttribute("usuarios", usuarios);

        return "listaUsuariosView";
    }


    @PostMapping("/formularioRegistro")
    public String crearUsuario(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("tipo") String tipo,
                               Model model) {

        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("tipo", tipo);
        Usuario usuario = new Usuario(username, password);

        Authority authority = new Authority();
        try {
            authority.setName(AuthorityName.valueOf(tipo));
        } catch (IllegalArgumentException e) {
            return "errorView";
        }
        authorityRepository.save(authority);
        usuario.getAuthorities().add(authority);
        usuarioService.crearUsuario(usuario);

        return "crearUsuarioView";
    }


    @PostMapping("/actualizarUsuario")
    public String actualizarUsuario(@RequestParam("usernameMOD") String usernameMOD,
                                    @RequestParam("passwordMOD") String passwordMOD,
                                    Model model) {

        boolean usuarioEncontrado = false;

        for (Usuario usuario : usuarioService.obtenerUsuarios()) {
            if (usuario.getUsername().equals(usernameMOD)) {
                usuarioEncontrado = true;
                usuario.setPassword(passwordMOD);
                usuarioService.actualizarUsuario(usuario);
                break;
            }
        }

        if (!usuarioEncontrado) {
            System.out.println("Usuario no encontrado");
        }

        List<Usuario> usuarios = usuarioService.obtenerUsuarios();
        model.addAttribute("usuarios", usuarios);

        return "listaUsuariosView";
    }


}
