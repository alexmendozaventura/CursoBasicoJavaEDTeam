package team.ed.clase02;

public class Ejecutar {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 20;
        System.out.println(p.edad);

        Estudiante e = new Estudiante();
        e.edad = 13;
        e.saludar();
    }
}
