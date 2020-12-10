package com.example.paradigmas.dao.interfaces;

import com.example.paradigmas.models.Liquidaciones;

import java.util.List;

public interface ILiquidacionesDao {
    List<Liquidaciones> findAll();

    Liquidaciones save(Liquidaciones liquidaciones);
}
