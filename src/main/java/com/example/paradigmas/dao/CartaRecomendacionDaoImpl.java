package com.example.paradigmas.dao;

import com.example.paradigmas.dao.interfaces.ICartaRecomendacionDao;
import com.example.paradigmas.repository.CartaRecomendacionRepository;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class CartaRecomendacionDaoImpl implements ICartaRecomendacionDao {
    private CartaRecomendacionRepository repository;

    //Methods
}
