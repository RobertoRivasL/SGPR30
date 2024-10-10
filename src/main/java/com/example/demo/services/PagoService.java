package com.example.demo.services;

import com.example.demo.models.Pago;
import com.example.demo.repositories.IPagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {

    private final IPagoRepository pagoRepository;


    public PagoService(IPagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    public void crearPago(Pago pago) {
        pagoRepository.save(pago);
    }

    public List<Pago> obtenerPagos() {

        List<Pago> pagos = pagoRepository.findAll();

        if (pagos.isEmpty()) {
            System.out.println("No hay pagos en el repositorio");
        }
        return pagos;

    }


}
