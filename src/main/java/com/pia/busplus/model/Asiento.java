package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Asientos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asiento {

    @Id
    @Column(name = "ID_asiento")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_viaje")
    private Viaje viaje;

    private Integer numero_asiento;

    @Enumerated(EnumType.STRING)
    private EstadoAsiento estado_asiento;

    public enum EstadoAsiento {
        reservado, ocupado, cancelado
    }
}
