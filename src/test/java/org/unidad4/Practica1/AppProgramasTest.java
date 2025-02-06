package org.unidad4.Practica1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppProgramasTest {

    @Test
    void shouldAddCadenaToList() {
        Cadena cadena = new Cadena("Antena 3");
        AppProgramas.listaCadenas.add(cadena);
        assertTrue(AppProgramas.listaCadenas.contains(cadena));
    }

    @Test
    void shouldReturnCorrectNumberOfInvitadosForTemporada() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("El Hormiguero", cadena, "Pedro Sanchez");
        programa.insertarInvitado("Aitana", "cantante", "2042-12-12", 1);
        programa.insertarInvitado("Iosif", "humorista", "2042-07-14", 1);
        programa.insertarInvitado("Rudolph", "mascota", "2050-12-25", 1);
        assertEquals(3, programa.invitadosTemporada(1));
    }

    @Test
    void shouldReturnCorrectNumberOfVecesInvitado() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("El Hormiguero", cadena, "Pedro Sanchez");
        programa.insertarInvitado("Aitana", "cantante", "2042-12-12", 1);
        programa.insertarInvitado("Aitana", "cantante", "2044-12-12", 1);
        assertEquals(2, programa.vecesInvitado("Aitana"));
    }

    @Test
    void shouldReturnTrueIfInvitadoExists() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("El Hormiguero", cadena, "Pedro Sanchez");
        programa.insertarInvitado("Iosif", "humorista", "2042-07-14", 1);
        assertTrue(programa.buscarInvitado("Iosif"));
    }

    @Test
    void shouldReturnFalseIfInvitadoDoesNotExist() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("El Hormiguero", cadena, "Pedro Sanchez");
        assertFalse(programa.buscarInvitado("Iosif"));
    }

    @Test
    void shouldReturnCorrectInvitadoDetails() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("El Hormiguero", cadena, "Pedro Sanchez");
        programa.insertarInvitado("Aitana", "cantante", "2042-12-12", 1);
        Invitado invitado = programa.getInvitado("Aitana");
        assertNotNull(invitado);
        assertEquals("Aitana", invitado.getNombre());
        assertEquals("cantante", invitado.getProfesion());
        assertEquals(LocalDate.of(2042, 12, 12), invitado.getFecha_visita());
    }

    @Test
    void shouldReturnCorrectProgramaDetails() {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("El Hormiguero", cadena, "Pedro Sanchez");
        assertEquals("El Hormiguero", programa.getNombre());
        assertEquals("Antena 3", programa.getCadena().getNombre());
        assertEquals("Pedro Sanchez", programa.getDirector().getNombre());
    }
}
