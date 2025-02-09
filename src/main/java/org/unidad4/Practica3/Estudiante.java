package org.unidad4.Practica3;

import lombok.*;

@Getter @Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class Estudiante {
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
}
