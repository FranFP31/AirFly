package Persona;
/*Gestión de Persona.Personal
Implementar una clase Empleado con atributos como nombre, ID y departamento.
Crear objetos de tipo Empleado con diferentes datos y mostrarlos en pantalla.*/

public class Personal {
    static int id=0;
    int contador;
    String nombre;
    byte edad;
    String departamento;
    public Personal(String nombre, byte edad
            ,String departamento) {
       this.contador=++id;
       this.nombre = nombre;
       this.edad = edad;
       this.departamento = departamento;
    }

    public String getNombre() {
        this.contador=++id;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.contador=++id;
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return
                "ID: "+contador+ "Nombre: " + nombre+ ", Edad: " + edad+ " Departamento: " + departamento;
    }
}
