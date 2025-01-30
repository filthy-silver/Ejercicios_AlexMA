package org.unidad4;

import java.time.LocalDate;

public class Prestamo {

    private Estudiante estudiante;
    private Libro libro;
    private LocalDate fechaPrestamo;

    public Prestamo (Estudiante estudiante, Libro libro){
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
    }

    //region Getters y Setters
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    //endregion

    @Override
    public String toString() {
        return "Prestamo [estudiante=" + estudiante + ", fechaPrestamo=" + fechaPrestamo + ", libro=" + libro +  ", fecha" + fechaPrestamo + "]";
    }
}
