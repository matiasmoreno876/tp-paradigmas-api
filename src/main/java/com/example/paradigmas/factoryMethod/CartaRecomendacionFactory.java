package com.example.paradigmas.factoryMethod;

import com.example.paradigmas.dao.interfaces.ICartaRecomendacionDao;
import com.example.paradigmas.models.CartaRecomendacion;
import com.example.paradigmas.models.Documento;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class CartaRecomendacionFactory extends DocumentoFactory {

    private final ICartaRecomendacionDao dao;

    @Override
    public List<Documento> listar() {
        return new ArrayList<>();
    }

    @Override
    public Documento crear() {
        return new CartaRecomendacion();
    }

    @Override
    public void actualizar() {
    }

    @Override
    public void borrar() {
    }
}
