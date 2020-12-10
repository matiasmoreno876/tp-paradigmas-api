package com.example.paradigmas.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Liquidaciones extends Documento {
    @Id
    @Column(name = "CODIGO_EMPLEADO")
    private String codigoEmpleado;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Column(name = "PUESTO_TRABAJO")
    private String puestoDeTrabajo;
    @Column(name = "FECHA_CESE")
    private LocalDate fechaCese;
    @Column(name = "NOMBRE_BANCO")
    private String nombreBanco;
    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;
}
