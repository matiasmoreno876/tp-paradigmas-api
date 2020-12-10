package com.example.paradigmas.factoryMethod;

import com.example.paradigmas.dao.interfaces.ILiquidacionesDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LiquidacionesFactory extends DocumentoFactory {

    private final ILiquidacionesDao dao;

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
