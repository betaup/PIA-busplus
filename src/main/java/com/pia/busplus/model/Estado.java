package com.pia.busplus.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Estados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estado {
    @Id
    @Column(name = "ID_estado")
    private Integer id;

    private String nombre_estado;
    private String nombre_municipio;
    private String codigo_postal;

    @Enumerated(EnumType.STRING)
    private Region region;

    public enum Region {
        norte, centro, sur
    }
}

