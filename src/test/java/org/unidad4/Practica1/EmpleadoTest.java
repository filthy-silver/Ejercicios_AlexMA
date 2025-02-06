package org.unidad4.Practica1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void shouldGenerateIDForFirstEmployee() {
        Empleado emp = new Empleado("Juan", "técnico", null);
        assertEquals("EP001", emp.getId());
    }

    @Test
    void shouldGenerateIDForTenthEmployee() {
        for (int i = 0; i < 9; i++) {
            new Empleado("Empleado" + i, "técnico", null);
        }
        Empleado emp = new Empleado("Juan", "técnico", null);
        assertEquals("EP010", emp.getId());
    }

    @Test
    void shouldGenerateIDForHundredthEmployee() {
        for (int i = 0; i < 99; i++) {
            new Empleado("Empleado" + i, "técnico", null);
        }
        Empleado emp = new Empleado("Juan", "técnico", null);
        assertEquals("EP100", emp.getId());
    }

    @Test
    void shouldNotAllowMoreThanThousandEmployees() {
        for (int i = 0; i < 1000; i++) {
            new Empleado("Empleado" + i, "técnico", null);
        }
        Empleado emp = new Empleado("Juan", "técnico", null);
        assertNull(emp.getId());
    }

    @Test
    void shouldSetCargoToPteIfInvalid() {
        Empleado emp = new Empleado("Juan", "invalid", null);
        assertEquals("pte", emp.getCargo());
    }

    @Test
    void shouldSetDirectorToNullIfCargoIsDirector() {
        Empleado director = new Empleado("Pedro", "director", null);
        Empleado emp = new Empleado("Juan", "director", director);
        assertNull(emp.getDirector());
    }
}
