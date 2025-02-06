package org.unidad4.Practica1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProgramaTest {

    @Test
    void shouldAddProgramaToCadena() {
        Cadena cadena = new Cadena("Cadena1");
        Empleado director = new Empleado("Director", "director", null);
        Programa programa = new Programa("Programa1", cadena, director);
        assertTrue(cadena.getListaProgramas().contains(programa));
    }

    @Test
    void shouldAddEmpleadoToPrograma() {
        Cadena cadena = new Cadena("Cadena1");
        Empleado director = new Empleado("Director", "director", null);
        Programa programa = new Programa("Programa1", cadena, director);
        programa.insertarEmpleado("Empleado1", "técnico", director);
        assertEquals(2, programa.getListaEmpleados().size());
    }

    @Test
    void shouldAddInvitadoToPrograma() {
        Cadena cadena = new Cadena("Cadena1");
        Empleado director = new Empleado("Director", "director", null);
        Programa programa = new Programa("Programa1", cadena, director);
        programa.insertarInvitado("Invitado1", "Actor", 1);
        assertEquals(1, programa.getListaInvitados().size());
    }

    @Test
    void shouldReturnCorrectNumberOfInvitadosForTemporada() {
        Cadena cadena = new Cadena("Cadena1");
        Empleado director = new Empleado("Director", "director", null);
        Programa programa = new Programa("Programa1", cadena, director);
        programa.insertarInvitado("Invitado1", "Actor", 1);
        programa.insertarInvitado("Invitado2", "Cantante", 1);
        programa.insertarInvitado("Invitado3", "Actor", 2);
        assertEquals(2, programa.invitadosTemporada(1));
    }

    @Test
    void shouldReturnCorrectNumberOfVecesInvitado() {
        Cadena cadena = new Cadena("Cadena1");
        Empleado director = new Empleado("Director", "director", null);
        Programa programa = new Programa("Programa1", cadena, director);
        programa.insertarInvitado("Invitado1", "Actor", 1);
        programa.insertarInvitado("Invitado1", "Actor", 2);
        assertEquals(2, programa.vecesInvitado("Invitado1"));
    }

    @Test
    void shouldReturnInvitadoByName() {
        Cadena cadena = new Cadena("Cadena1");
        Empleado director = new Empleado("Director", "director", null);
        Programa programa = new Programa("Programa1", cadena, director);
        programa.insertarInvitado("Invitado1", "Actor", 1);
        Invitado invitado = programa.getInvitado("Invitado1");
        assertNotNull(invitado);
        assertEquals("Invitado1", invitado.getNombre());
    }

    @Test
    void shouldReturnTrueIfInvitadoExists() {
        Cadena cadena = new Cadena("Cadena1");
        Empleado director = new Empleado("Director", "director", null);
        Programa programa = new Programa("Programa1", cadena, director);
        programa.insertarInvitado("Invitado1", "Actor", 1);
        assertTrue(programa.buscarInvitado("Invitado1"));
    }

    @Test
    void shouldReturnFalseIfInvitadoDoesNotExist() {
        Cadena cadena = new Cadena("Cadena1");
        Empleado director = new Empleado("Director", "director", null);
        Programa programa = new Programa("Programa1", cadena, director);
        assertFalse(programa.buscarInvitado("Invitado1"));
    }
}
