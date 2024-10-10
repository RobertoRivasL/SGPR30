package com.example.demo.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "rut", nullable = false)
    private String rut; //Rut cliente
    @Column(name = "nombres", nullable = false)
    private String nombres; //Nombres cliente
    @Column(name = "apellidos", nullable = false)
    private String apellidos; //Apellidos cliente
    @Column(name = "telefono", nullable = false)
    private int telefono; //Teléfono cliente
    @Column(name = "direccion", nullable = false)
    private String direccion; //Direccion cliente
    @Column(name = "comuna", nullable = false)
    private String comuna; //Comuna cliente
    @Column(name = "edad", nullable = false)
    private int edad; //Edad cliente


}
