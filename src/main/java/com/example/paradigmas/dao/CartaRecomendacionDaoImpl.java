package com.example.paradigmas.dao;

import com.example.paradigmas.dao.interfaces.ICartaRecomendacionDao;
import com.example.paradigmas.models.CartaRecomendacion;
import com.example.paradigmas.repository.CartaRecomendacionRepository;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
public class CartaRecomendacionDaoImpl implements ICartaRecomendacionDao {
    private CartaRecomendacionRepository repository;

    @Override
    public List<CartaRecomendacion> findAll() {
        return this.repository.findAll();
    }

    @Override
    public CartaRecomendacion save(CartaRecomendacion cartaRecomendacion) {
        return this.repository.save(cartaRecomendacion);
    }
}
