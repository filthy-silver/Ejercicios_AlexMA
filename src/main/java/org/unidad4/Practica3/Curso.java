package org.unidad4.Practica3;

import lombok.*;

@Getter @Setter
@ToString
@AllArgsConstructor
public class Curso {
    @NonNull
    private String nombre;
    private int horas;
}
