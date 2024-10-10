package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificador;
    @Column(name = "rut_Cliente", nullable = false)
    private String rutCliente;
    @Column(name = "dia", nullable = false)
    private String dia;
    @Column(name = "hora", nullable = false)
    private String hora;
    @Column(name = "lugar", nullable = false)
    private String lugar;
    @Column(name = "duracion", nullable = false)
    private String duracion;
    @Column(name = "cantidad_Asistentes", nullable = false)
    private String cantidadAsistentes;

    public Capacitacion(String rutCliente, String dia, String hora, String lugar, String duracion, String cantidadAsistentes) {
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;

    }

}
