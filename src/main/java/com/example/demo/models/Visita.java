package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "visitas")
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha_visita", nullable = false)
    private LocalDate fechaVisita;

    @Column(name = "nombre_visita")
    private String nombre;

    @Column(name = "detalle", nullable = false)
    private String detalle;


    public Visita(LocalDate fechaVisita, String nombre, String detalle) {
        this.fechaVisita = fechaVisita;
        this.nombre = nombre;
        this.detalle = detalle;
    }
}
