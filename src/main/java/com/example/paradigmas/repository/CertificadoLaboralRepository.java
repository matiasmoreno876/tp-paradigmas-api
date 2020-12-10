package com.example.paradigmas.repository;

import com.example.paradigmas.models.CertificadoLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificadoLaboralRepository extends JpaRepository<CertificadoLaboral, String> {
}
