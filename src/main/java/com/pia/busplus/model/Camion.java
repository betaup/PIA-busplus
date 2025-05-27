package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Camiones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Camion {

    @Id
    @Column(name = "ID_camion")
    private Integer id;

    private String modelo_camion;
    private Integer capacidad_pasajeros;
    private String placa;

    @Enumerated(EnumType.STRING)
    private EstadoCamion estado;

    public enum EstadoCamion {
        activo, inactivo, mantenimiento
    }
}
