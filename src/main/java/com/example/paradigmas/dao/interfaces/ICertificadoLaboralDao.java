package com.example.paradigmas.dao.interfaces;

import com.example.paradigmas.models.CertificadoLaboral;

import java.util.List;
import java.util.Optional;

public interface ICertificadoLaboralDao {
    List<CertificadoLaboral> findAll();
    CertificadoLaboral save(CertificadoLaboral certificadoLaboral);
}
