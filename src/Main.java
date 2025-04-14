import Persona.Personal;

/*
La aerolínea AirFly necesita un sistema básico para gestionar su personal y flota de aviones. Se requiere desarrollar una aplicación en Java que contemple lo siguiente:

1-Gestión de Persona.Personal
    Implementar una clase Empleado con atributos como nombre, ID y departamento.
    Crear objetos de tipo Empleado con diferentes datos y mostrarlos en pantalla.
2-Gestión de Flota de Aviones
    Implementar una clase Avion con atributos como matrícula, modelo y capacidad de pasajeros.
    Crear objetos de tipo Avion con diferentes datos y mostrarlos en pantalla.
3-Programa Principal (Main)
    En la clase Main, instanciar al menos tres empleados y dos aviones.
    Mostrar en pantalla la información de cada objeto utilizando System.out.println().
* */
public class Main {
    public static void main(String[] args) {
/*Gestión de Persona.Personal*/
    /*Empleados*/
        Personal p1=new Personal("Mery",(byte)28,"Asistente");
        Personal p2=new Personal("Anastasio",(byte)33,"Piloto");
        Personal p3=new Personal("Miguel",(byte)29, "Co-Piloto");
/*Gestión de Aviones*/
        /*Aviones**/
        Avion A1=new Avion("Wizard",(byte)5307,"L-14",(byte) 83);
        Avion A2=new Avion("Condor",(byte)1222,"L-04",(byte) 50);
        Avion A3=new Avion("Night Witch",(byte)588,"Polikarpov-02",(byte) 2);

/*Programa Principal (Main)*/
        System.out.println("Flota Aviones:\n "+A1.toString()+"\n"+A2.toString()+"\n"+A3.toString()+"\n");
        System.out.println("Persona.Personal Aviones:\n "+p1.toString()+"\n"+p2.toString()+"\n"+p3.toString()+"\n");
    }


}