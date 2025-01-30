package org.unidad4;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private int peso;
    private String profesion;
    private String ciudad;

    public Persona(String nombre, String apellido, String dni, int edad, int peso, String pro, String ciudad) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.profesion = pro;
        this.ciudad = ciudad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("Messi")) {
            System.out.println("No se puede asignar Messi");
        } else {
            this.nombre = nombre;
        }

    }

    //region Geters y Seters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    //endregion


    public String concatenar() {

        return this.nombre +" "+ this.apellido;

    }

    public void imprimirInformacion() {

        System.out.println(this.nombre + " " + this.apellido + " " + this.dni + " " + this.edad + " " + this.peso);

    }

    @Override
    public String toString() {

        return "Persona " + nombre + " con el apellido " + apellido + " y con el dni" + dni + " con la edad de " + edad + " y con el peso de " + peso + " con la profesion de " + profesion + " y viviendo en la ciudad de " + ciudad;

    }

}