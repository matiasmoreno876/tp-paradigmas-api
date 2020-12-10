package com.example.paradigmas.dao;

import com.example.paradigmas.dao.interfaces.ICertificadoLaboralDao;
import com.example.paradigmas.models.CertificadoLaboral;
import com.example.paradigmas.repository.CertificadoLaboralRepository;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
public class CertificadoLaboralDaoImpl implements ICertificadoLaboralDao {
    private CertificadoLaboralRepository repository;

    @Override
    public List<CertificadoLaboral> findAll() {
        return this.repository.findAll();
    }

    @Override
    public CertificadoLaboral save(CertificadoLaboral certificadoLaboral) {
        return this.repository.save(certificadoLaboral);
    }
}
