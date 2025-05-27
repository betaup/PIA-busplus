package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Viajes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Viaje {

    @Id
    @Column(name = "ID_viaje")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "ID_ruta")
    private Ruta ruta;

    @ManyToOne
    @JoinColumn(name = "ID_servicio")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "ID_camion_disponible")
    private Camion camion;

    @ManyToOne
    @JoinColumn(name = "ID_tipo")
    private TipoBoleto tipoBoleto;

    @ManyToOne
    @JoinColumn(name = "ID_conductor")
    private Conductor conductor;

    private LocalDateTime fecha_salida;

    @Enumerated(EnumType.STRING)
    private TipoViaje tipo_viaje;

    private LocalDateTime fecha_regreso;

    @Enumerated(EnumType.STRING)
    private EstadoViaje estado;

    public enum TipoViaje { sencillo, redondo }

    public enum EstadoViaje { confirmado, cancelado, en_proceso }
}
