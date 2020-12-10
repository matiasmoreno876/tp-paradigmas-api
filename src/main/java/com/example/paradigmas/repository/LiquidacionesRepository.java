package com.example.paradigmas.repository;

import com.example.paradigmas.models.Liquidaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiquidacionesRepository extends JpaRepository<Liquidaciones, String> {
}
