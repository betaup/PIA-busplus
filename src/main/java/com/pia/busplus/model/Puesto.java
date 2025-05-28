package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Puestos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Puesto {

    @Id
    @Column(name = "ID_puesto")
    private Integer id;

    @Column(name = "nombre_puesto")
    private String nombrePuesto;

    private String descripcion;

    @Column(name = "sueldo_base")
    private BigDecimal sueldoBase;
}

