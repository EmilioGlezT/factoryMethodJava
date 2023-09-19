package org.example;

public class IngenieriaFactory extends Factory {
    @Override
    public Alumno crearAlumno() {

        return new AlumnoIngenieria() {
        };
    }
}
