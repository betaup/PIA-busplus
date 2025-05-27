package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Pagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pago {

    @Id
    @Column(name = "ID_pago")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "ID_viaje")
    private Viaje viaje;

    @Enumerated(EnumType.STRING)
    private MetodoPago metodo_pago;

    private String numero_tarjeta;
    private BigDecimal monto_base;
    private BigDecimal descuento;
    private BigDecimal monto_final;

    @Enumerated(EnumType.STRING)
    private EstadoPago estado;

    private LocalDate fecha_pago;

    public enum MetodoPago {
        Tarjeta, Efectivo
    }

    public enum EstadoPago {
        pendiente, rechazado, completado
    }
}
