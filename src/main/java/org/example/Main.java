package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //Forma comun de crear instancias de clases
        AlumnoIngenieria alumno = new AlumnoIngenieria();
        AlumnoLicenciatura alumno2= new AlumnoLicenciatura();

        //Creacion de factorys que crean objetos de un determinado tipo
        Factory ingenieriaFactory = new IngenieriaFactory();
        Alumno alumnoIngenieria = ingenieriaFactory.crearAlumno();

        Factory licenciaturaFactory = new LicenciaturaFactory();
        Alumno alumnoLicenciatura = licenciaturaFactory.crearAlumno();


        alumnoLicenciatura.estudia();
        alumnoIngenieria.estudia();
        alumno.estudia();
        alumno2.estudia();


            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.




    }

}