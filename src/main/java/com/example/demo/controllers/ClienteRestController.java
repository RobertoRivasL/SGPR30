package com.example.demo.controllers;


import com.example.demo.dto.ClienteDtoResponse;
import com.example.demo.services.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ClienteRestController {

    private final ClienteService clienteService;

    public ClienteRestController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @GetMapping("/cliente")
    public ResponseEntity<List<ClienteDtoResponse>> obtenerDatos() {
        List<ClienteDtoResponse> clienteDtoResponseList = clienteService.obtenerClientesRutNombres();
        return new ResponseEntity<>(clienteDtoResponseList, HttpStatus.OK);
    }


}
