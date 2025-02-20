package org.unidad6.ejercicioE;

public class Programa {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[] {
                new Diseñador(),
                new Gerente(),
                new Desarrollador()
        };
        System.out.println("=== Usando el array polimórfico ===");
        for (Empleado empleado : empleados) {
            empleado.realizarTarea();
        }

        System.out.println("=== Usando el método asignarTarea ===");
        Empleado JoseJuán = new Diseñador();
        Empleado JuanJosé = new Gerente();

        asignarTarea(JoseJuán);
        asignarTarea(JuanJosé);
    }

    public static void asignarTarea(Empleado empleado){
        empleado.realizarTarea();
    }
}
