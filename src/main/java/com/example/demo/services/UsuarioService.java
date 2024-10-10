package com.example.demo.services;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final IUsuarioRepository usuarioRepo;


    @Autowired
    public UsuarioService(IUsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }


    public void crearUsuario(Usuario usuario) {
        boolean estaRegistrado = false;


        for (Usuario buscarUsuario : usuarioRepo.findAll()) {
            if (buscarUsuario.getUsername().equals(usuario.getUsername())) {
                estaRegistrado = true;
                break;
            }
        }
        if (estaRegistrado) {
            System.out.println("El Usuario ya esta registrado");
        } else {
            System.out.println("El Usuario ha sido Registrado Exitosamente");
            usuarioRepo.save(usuario);
        }

    }

    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> obtenerUsuarios() {

        List<Usuario> usuarios = usuarioRepo.findAll();

        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios en el repositorio");
        }
        return usuarios;

    }
}
