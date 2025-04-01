package org.unidad7.equals_hashcode;

public class Pruebas {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Juan", "Pérez", 12345);
        Paciente p2 = new Paciente("Ana", "Gómez", 67890);
        Paciente p3 = new Paciente("Juan", "Pérez", 12345);
        Paciente p4 = new Paciente("Juan", "Pérez", 54321);

        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.equals(p3)); // true
        System.out.println(p1.hashCode() == p3.hashCode()); // true
        System.out.println(p1.hashCode() == p4.hashCode()); // false


        System.out.println(p1); // Paciente{nombre='Juan', apellido='Pérez', sip=12345}
    }
}
