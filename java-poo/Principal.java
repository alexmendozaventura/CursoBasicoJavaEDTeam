public class Principal {
    public static void main(String[] args) {
        Persona persona = new Persona();
        /*
        persona.set = "Alex Mendoza";
        persona.edad = 26;
        persona.peso = 70f;
        persona.estatura = 1.70f;
        */
        persona.setNombre("Alex Mendoza");
        persona.setEdad(-14);
        persona.setEstatura(70f);
        persona.setPeso(1.70f);
        /*
        System.out.println("Nombre: " + persona.nombre );
        System.out.println("Edad: " + persona.edad );
        System.out.println("Peso: " + persona.peso );
        System.out.println("Estatura: " + persona.estatura );
        */
        System.out.println("Nombre: " + persona.getNombre() );
        System.out.println("Edad: " + persona.getEdad() );
        System.out.println("Peso: " + persona.getPeso() );
        System.out.println("Estatura: " + persona.getEstatura() );


        Persona princesa = new Persona("Clarie Antunez", 22, 60, 1.70f);
        System.out.println("Nombre: " + princesa.getNombre() );
        System.out.println("Edad: " + princesa.getEdad() );
        System.out.println("Peso: " + princesa.getPeso() );
        System.out.println("Estatura: " + princesa.getEstatura() );
        princesa.saludar();


        Persona personita = new Persona("Princesa");

    }
}
