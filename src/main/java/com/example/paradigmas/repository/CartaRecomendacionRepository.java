package com.example.paradigmas.repository;

import com.example.paradigmas.models.CartaRecomendacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaRecomendacionRepository extends JpaRepository<CartaRecomendacion, String> {
}
