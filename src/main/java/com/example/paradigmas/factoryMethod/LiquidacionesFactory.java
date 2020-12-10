package com.example.paradigmas.factoryMethod;

import com.example.paradigmas.dao.interfaces.ILiquidacionesDao;
import com.example.paradigmas.models.Documento;
import com.example.paradigmas.models.Liquidaciones;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class LiquidacionesFactory extends DocumentoFactory {

    private final ILiquidacionesDao dao;

    @Override
    public List<Documento> listar() {
        return new ArrayList<>();
    }

    @Override
    public Documento crear() {
        return new Liquidaciones();
    }

    @Override
    public void actualizar() {
    }

    @Override
    public void borrar() {
    }
}
