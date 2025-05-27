package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @Column(name = "ID_cliente")
    private Integer id;

    private String nombre_cliente;
    private String apellido_materno;
    private String apellido_paterno;
    private LocalDate fecha_nacimiento;
    private String telefono;
    private String correo;
    private String colonia;
    private String calle;
    private char sexo;

    @ManyToOne
    @JoinColumn(name = "ID_estado")
    private Estado estado;
}
