package com.example.paradigmas.dao.interfaces;

import com.example.paradigmas.models.CertificadoLaboral;

import java.util.List;

public interface ICertificadoLaboralDao {
    List<CertificadoLaboral> findAll();
    CertificadoLaboral save(CertificadoLaboral certificadoLaboral);
}
