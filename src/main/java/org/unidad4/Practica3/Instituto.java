package org.unidad4.Practica3;

import java.util.ArrayList;
import java.util.Objects;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
public class Instituto {
    @NonNull
    private final String nombre;
    private String poblacion;
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Instituto(String nombre, String poblacion) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.poblacion = poblacion;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("No se puede crear un estudiante nulo.");
        }
    }

    public void agregarCurso(Curso curso) {
        if (curso != null) {
            for (Curso c : cursos) {
                if (c.getNombre().equals(curso.getNombre()) && c.getHoras() == curso.getHoras()) {
                    System.out.println("El curso ya existe.");
                    return;
                }
                cursos.add(curso);
            }
        } else {
            System.out.println("No se puede crear un curso nulo.");
        }
    }

    public String getListaCursos() {
        return cursos.toString();
    }

    public String getListaEstudiantes() {
        return estudiantes.toString();
    }
}
