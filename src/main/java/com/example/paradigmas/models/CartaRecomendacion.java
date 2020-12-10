package com.example.paradigmas.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CartaRecomendacion extends Documento {

    @Id
    @Column(name = "CODIGO_EMPLEADO")
    private String codigoEmpleado;
    @Column(name = "NOMBRE_EMPRESA")
    private String nombreEmpresa;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Column(name = "RECOMENDACION")
    private String recomendacion;
}
