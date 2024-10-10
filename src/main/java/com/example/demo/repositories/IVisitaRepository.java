package com.example.demo.repositories;

import com.example.demo.models.Visita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVisitaRepository extends JpaRepository<Visita, Integer> {
}
