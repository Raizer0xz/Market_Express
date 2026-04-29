package com.example.sucursal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Surcusal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 100, message = "Entre 2 y 100 caracteres")
    @Column(nullable = false)//le dice a la BD que esa columna no puede tener el valor NULL.
    private String nombre;

    @NotBlank(message = "La Direccion es obligatorio")
    @Size(min = 2, max = 500, message = "Entre 2 y 100 caracteres")
    @Column(nullable = false)//le dice a la BD que esa columna no puede tener el valor NULL.
    private String direccion;

    @NotBlank(message = "La calle es obligatorio")
    @Size(min = 2, max = 500, message = "Entre 2 y 100 caracteres")
    @Column(nullable = false)//le dice a la BD que esa columna no puede tener el valor NULL.
    private String calle;

    @NotBlank(message = "La Comunidad es obligatorio")
    @Size(min = 2, max = 500, message = "Entre 2 y 100 caracteres")
    @Column(nullable = false)//le dice a la BD que esa columna no puede tener el valor NULL.
    private String comuna;
    private String cuidad;
}
