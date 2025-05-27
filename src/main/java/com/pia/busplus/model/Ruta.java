package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Rutas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ruta {

    @Id
    @Column(name = "ID_ruta")
    private Integer id;

    private Integer duracion_viaje;

    @Enumerated(EnumType.STRING)
    private EstadoRuta estado;

    private BigDecimal precio_base;

    @ManyToOne
    @JoinColumn(name = "ID_terminal_origen")
    private Terminal terminalOrigen;

    @ManyToOne
    @JoinColumn(name = "ID_terminal_destino")
    private Terminal terminalDestino;

    public enum EstadoRuta {
        activa, inactiva
    }
}
