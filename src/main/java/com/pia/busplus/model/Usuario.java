package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter @Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_usuario")
    private Long id;

    @Column(name = "nombre_usuario", nullable = false, unique = true)
    private String nombreUsuario;

    @Column(nullable = false)
    private String contrasenia;

    private boolean esAdmin = false;
    private boolean activo = true;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_empleado")
    private Empleado empleado;

}
