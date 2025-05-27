package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Conductores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conductor {

    @Id
    @Column(name = "ID_conductor")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "ID_empleado")
    private Empleado empleado;

    private String licencia_conducir;
    private LocalDate fecha_vencimiento;

    @Enumerated(EnumType.STRING)
    private EstadoConductor estado_conductor;

    public enum EstadoConductor {
        disponible, asignado, descanso
    }
}
