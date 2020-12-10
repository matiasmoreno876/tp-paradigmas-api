package com.example.paradigmas.factoryMethod;

import com.example.paradigmas.dao.interfaces.ICertificadoLaboralDao;
import com.example.paradigmas.models.CertificadoLaboral;
import com.example.paradigmas.models.Documento;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class CertificadoLaboralFactory extends DocumentoFactory {

    private final ICertificadoLaboralDao dao;

    @Override
    public List<Documento> listar() {
        return new ArrayList<>();
    }

    @Override
    public Documento crear() {
        return new CertificadoLaboral();
    }

    @Override
    public void actualizar() {
    }

    @Override
    public void borrar() {
    }
}
