package com.example.demo.services;

import com.example.demo.dto.ClienteDtoResponse;
import com.example.demo.models.Cliente;
import com.example.demo.repositories.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {


    private final IClienteRepository clienteRepo;


    @Autowired
    public ClienteService(IClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }


    public List<Cliente> obtenerClientes() {

        List<Cliente> clientes = clienteRepo.findAll();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes en el repositorio");
        }
        return clientes;
    }

    public List<ClienteDtoResponse> obtenerClientesRutNombres() {


        List<Cliente> clientes = clienteRepo.findAll();
        List<ClienteDtoResponse> clientePorRutNombre = new ArrayList<>();
        for (Cliente cliente : clientes) {

            String clienteRut = cliente.getRut();
            String clienteNombres = cliente.getNombres();

            ClienteDtoResponse clienteDtoResponse = new ClienteDtoResponse(clienteRut, clienteNombres);

            clientePorRutNombre.add(clienteDtoResponse);


        }
        return clientePorRutNombre;

    }

}
