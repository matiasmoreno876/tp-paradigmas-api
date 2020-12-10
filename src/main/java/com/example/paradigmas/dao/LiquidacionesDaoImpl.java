package com.example.paradigmas.dao;

import com.example.paradigmas.dao.interfaces.ILiquidacionesDao;
import com.example.paradigmas.models.Liquidaciones;
import com.example.paradigmas.repository.LiquidacionesRepository;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
public class LiquidacionesDaoImpl implements ILiquidacionesDao {
    private LiquidacionesRepository repository;

    @Override
    public List<Liquidaciones> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Liquidaciones save(Liquidaciones liquidaciones) {
        return this.repository.save(liquidaciones);
    }
}
