package org.unidad4.Practica1;

public class Empleado {
    private static int numEmp = 1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

//region Constructors
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }
    //endregion

    public Empleado(String nombre, String cargo, Empleado director) {
        this.nombre = nombre;
        cargo = cargo.toLowerCase();
        if (
                cargo.equals("técnico") ||
                cargo.equals("presentador") ||
                cargo.equals("colaborador")

        ) {
            this.cargo = cargo;
        } else if (cargo.equals("director")) {
            this.cargo = cargo;
            director = null;
        } else {
            this.cargo = "pte";
        }

        generateID();


    }

    private void generateID() {
        if (numEmp < 10){
            id = "EP00" + numEmp++;
        } else if (numEmp < 100){
            id = "EP0" + numEmp++;
        } else if (numEmp < 1000) {
            id = "EP" + numEmp++;
        } else {
            System.out.println("No se pueden crear más empleados");
        }
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }


}
