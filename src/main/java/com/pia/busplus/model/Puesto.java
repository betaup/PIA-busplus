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

    private String nombre_puesto;
    private String descripcion;
    private BigDecimal sueldo_base;
}
