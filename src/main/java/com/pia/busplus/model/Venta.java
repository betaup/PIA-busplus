package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Ventas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venta {

    @Id
    @Column(name = "ID_boleto")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_viaje")
    private Viaje viaje;

    @ManyToOne
    @JoinColumn(name = "ID_pago")
    private Pago pago;

    @ManyToOne
    @JoinColumn(name = "ID_empresa")
    private Empresa empresa;

    private LocalDate fecha_emision;
}

