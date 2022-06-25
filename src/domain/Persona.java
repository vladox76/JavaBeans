package domain;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public Persona(String nombre , String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getNombre(), persona.getNombre()) && Objects.equals(getApellido(), persona.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido());
    }
}
