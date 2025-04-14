/*Gestión de Flota de Aviones
Implementar una clase Avion con atributos como matrícula, modelo y capacidad de pasajeros.
Crear objetos de tipo Avion con diferentes datos y mostrarlos en pantalla.*/
public class Avion {
    static int id=0;
    int contador;
    //Gestión de flota
    String NombreAvion;
    byte matricula;
    String modelo;
    byte capacidad;
    public Avion(String nombreAvion,byte matricula,String modelo,byte capacidad) {
        this.contador=++id;
        this.NombreAvion=nombreAvion;
        this.matricula=matricula;
        this.modelo=modelo;
        this.capacidad=capacidad;
    }

    public String getNombreAvion() {
        this.contador=++id;
        return NombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.contador=++id;
        NombreAvion = nombreAvion;
    }

    public byte getMatricula() {
        return matricula;
    }

    public void setMatricula(byte matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public byte getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return
                "ID: "+contador+
                "Nombre Avion:" + NombreAvion +
                ", Matricula: " + matricula +
                ", Modelo: " + modelo +
                ", Capacidad: " + capacidad+"Pasajeros";
    }
}
