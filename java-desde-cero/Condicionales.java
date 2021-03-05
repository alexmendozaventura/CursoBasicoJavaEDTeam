public class Condicionales {
    public static void main(String[] args) {
        //Condicionales se ejecutan con la palabra reservada if
        int edad = 19;
        /*
        if(edad >= 18){

            System.out.println("eres mayor de edad");
        }else{
            System.out.println("aun no eres mayor de edad");
        }
        System.out.println("proceso terminado");
        */

        if(edad >= 0 && edad < 18){

            System.out.println("estas en la niñez");
        }else if (edad > 18 && edad < 65){
            System.out.println("Estas en la adultez");
        }
        else{
            System.out.println("Edad errada");
        }
    }
}
