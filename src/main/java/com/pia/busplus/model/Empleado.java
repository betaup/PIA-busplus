package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @Id
    @Column(name = "ID_empleado")
    private Integer id;

    private String nombre_empleado;
    private String apellido_paterno;
    private String apellido_materno;
    private char sexo;
    private LocalDate fecha_nacimiento;
    private String correo;
    private String telefono;
    private String colonia;
    private String calle;
    private LocalDate fecha_contratacion;

    @ManyToOne
    @JoinColumn(name = "ID_puesto")
    private Puesto puesto;

    @ManyToOne
    @JoinColumn(name = "ID_estado")
    private Estado estado;
}

