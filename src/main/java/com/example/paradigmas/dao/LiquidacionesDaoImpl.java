package com.example.paradigmas.dao;

import com.example.paradigmas.dao.interfaces.ILiquidacionesDao;
import com.example.paradigmas.repository.LiquidacionesRepository;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class LiquidacionesDaoImpl implements ILiquidacionesDao {
    private LiquidacionesRepository repository;

    //methods
}
