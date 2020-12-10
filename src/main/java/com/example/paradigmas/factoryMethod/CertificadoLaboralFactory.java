package com.example.paradigmas.factoryMethod;

import com.example.paradigmas.dao.interfaces.ICertificadoLaboralDao;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CertificadoLaboralFactory extends DocumentoFactory {

    private final ICertificadoLaboralDao dao;

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
