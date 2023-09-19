package org.example;

public class LicenciaturaFactory extends Factory {
    @Override
    public Alumno crearAlumno() {
        return new AlumnoLicenciatura();
    }
}
