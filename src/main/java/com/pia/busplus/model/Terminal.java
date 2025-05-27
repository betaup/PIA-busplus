package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Terminales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terminal {

    @Id
    @Column(name = "ID_terminal")
    private Integer id;

    private String nombre_terminal;
    private String colonia;
    private String calle;

    @ManyToOne
    @JoinColumn(name = "ID_estado")
    private Estado estado;
}
