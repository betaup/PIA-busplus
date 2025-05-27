package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Empresa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {

    @Id
    @Column(name = "ID_empresa")
    private Integer id;

    private String nombre_empresa;
    private String slogan;
    private String numero_telefonico;
    private String pagina_web;
    private LocalDate fecha_fundacion;
}

