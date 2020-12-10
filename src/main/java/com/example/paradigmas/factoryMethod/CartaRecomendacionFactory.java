package com.example.paradigmas.factoryMethod;

import com.example.paradigmas.dao.interfaces.ICartaRecomendacionDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CartaRecomendacionFactory extends DocumentoFactory {

    private final ICartaRecomendacionDao dao;

    @Override
    public void listar() {

    }

    @Override
    public void crear() {

    }

    @Override
    public void actualizar() {

    }

    @Override
    public void borrar() {

    }
}
