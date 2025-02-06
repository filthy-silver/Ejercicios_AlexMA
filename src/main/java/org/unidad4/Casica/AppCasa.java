package org.unidad4.Casica;

public class AppCasa {

        public static void main(String[] args) {

            Casa casa = new Casa("Calle Mayor 123");

            casa.agregarHabitacion("Dormitorio", 40f);
            casa.agregarHabitacion("Cocina", 35f);
            casa.agregarHabitacion("Baño", 10f);

            casa.mostrarHabitaciones();
            casa.getHabitacionMasGrande();
        }
}
