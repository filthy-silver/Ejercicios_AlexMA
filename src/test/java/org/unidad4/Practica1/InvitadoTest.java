package org.unidad4.Practica1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class InvitadoTest {

    @Test
    void shouldCreateInvitadoWithValidDate() {
        Invitado invitado = new Invitado("Juan", "Actor", "2023-10-15", 1);
        assertEquals(LocalDate.of(2023, 10, 15), invitado.getFecha_visita());
    }

    @Test
    void shouldNotCreateInvitadoWithInvalidDate() {
        Invitado invitado = new Invitado("Juan", "Actor", "invalid-date", 1);
        assertNull(invitado.getFecha_visita());
    }

    @Test
    void shouldSetFechaVisitaUsingUserInput() {
        // Mock user input
        Helper.sc = new java.util.Scanner("2023\n10\n15\n");
        Invitado invitado = new Invitado("Juan", "Actor", 1);
        assertEquals(LocalDate.of(2023, 10, 15), invitado.getFecha_visita());
    }

    @Test
    void shouldHandleInvalidUserInputForFechaVisita() {
        // Mock user input
        Helper.sc = new java.util.Scanner("invalid\n2023\n10\n15\n");
        Invitado invitado = new Invitado("Juan", "Actor", 1);
        assertEquals(LocalDate.of(2023, 10, 15), invitado.getFecha_visita());
    }

    @Test
    void shouldReturnCorrectNombre() {
        Invitado invitado = new Invitado("Juan", "Actor", "2023-10-15", 1);
        assertEquals("Juan", invitado.getNombre());
    }

    @Test
    void shouldReturnCorrectProfesion() {
        Invitado invitado = new Invitado("Juan", "Actor", "2023-10-15", 1);
        assertEquals("Actor", invitado.getProfesion());
    }

    @Test
    void shouldReturnCorrectTemporada() {
        Invitado invitado = new Invitado("Juan", "Actor", "2023-10-15", 1);
        assertEquals(1, invitado.getTemporada());
    }

    @Test
    void shouldReturnCorrectToString() {
        Invitado invitado = new Invitado("Juan", "Actor", "2023-10-15", 1);
        String expected = "Invitado{nombre='Juan', profesion='Actor', fecha_visita=2023-10-15, temporada=1}";
        assertEquals(expected, invitado.toString());
    }
}
