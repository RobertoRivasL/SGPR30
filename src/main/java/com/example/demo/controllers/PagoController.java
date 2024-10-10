package com.example.demo.controllers;

import com.example.demo.models.Pago;
import com.example.demo.services.PagoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }


    @GetMapping("/listaPagos")
    public String mostrarPaginaListaPagos(Model model) {

        List<Pago> pagos = pagoService.obtenerPagos();
        model.addAttribute("pagos", pagos);

        return "listaPagosView";
    }


    @PostMapping("/formularioPago")
    public String obtenerDatosPago(@RequestParam("monto") Integer monto,
                                   @RequestParam("fechaPago") LocalDate fechaPago,
                                   Model model) {

        model.addAttribute("monto", monto);
        model.addAttribute("fechaPago", fechaPago);

        Pago pago = new Pago(monto, fechaPago);

        pagoService.crearPago(pago);

        List<Pago> pagos = pagoService.obtenerPagos();
        model.addAttribute("pagos", pagos);

        return "listaPagosView";
    }


}
