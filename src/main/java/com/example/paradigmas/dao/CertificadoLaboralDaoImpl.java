package com.example.paradigmas.dao;

import com.example.paradigmas.dao.interfaces.ICertificadoLaboralDao;
import com.example.paradigmas.repository.CertificadoLaboralRepository;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class CertificadoLaboralDaoImpl implements ICertificadoLaboralDao {
    private CertificadoLaboralRepository repository;

    //Methods
}
