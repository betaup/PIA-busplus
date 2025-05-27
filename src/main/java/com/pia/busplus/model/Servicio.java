package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Servicios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servicio {

    @Id
    @Column(name = "ID_servicio")
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private String descripcion_servicio;
    private BigDecimal costo_servicio;

    public enum Categoria {
        ClaseA, ClaseB, ClaseC
        //Nota: En Java no se permiten enums con espacios, así que "Clase A" lo transformamos a ClaseA, etc.
    }
}
