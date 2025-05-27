package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Tipos_Boletos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoBoleto {

    @Id
    @Column(name = "ID_tipo")
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Descripcion descripcion;

    private BigDecimal descuento;

    public enum Descripcion {
        estudiante, adulto, normal
    }
}
