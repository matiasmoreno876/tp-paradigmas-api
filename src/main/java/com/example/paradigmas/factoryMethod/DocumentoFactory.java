package com.example.paradigmas.factoryMethod;

import com.example.paradigmas.models.Documento;

import java.util.List;

public abstract class DocumentoFactory {

    public abstract List<Documento> listar();

    public abstract Documento crear();

    public abstract void actualizar();

    public abstract void borrar();
}
