package com.example.paradigmas.dao.interfaces;

import com.example.paradigmas.models.CartaRecomendacion;

import java.util.List;

public interface ICartaRecomendacionDao {
    List<CartaRecomendacion> findAll();

    CartaRecomendacion save(CartaRecomendacion cartaRecomendacion);
}
