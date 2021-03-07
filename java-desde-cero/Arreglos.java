class Arreglos{
    public static void main(String[] args) {

        //Declaración de arreglos

        // int numeros[]
        //  numeros = new int[5];

        //int numeros[] = new int[5];

        //Persona personas[] = new Personas[5];

        // int a[] = new int[5],  int b[] = new int[3];

        // int a[] = {3,64,-1,20,55};

        // int a[] = new int[3];
        //Asignación de valores
        //a[0] = 19;
        //a[1] = 33;
        //a[2] = 79;

        //obtener los valores
        //int x = a[0];
        //System.out.println(x)

        //Excepciones
        //Indice fuera del arreglo

        //Declaración del arreglo
        int a[] = new int[5];
        //Poblar el arreglo
        a[0] = 99;
        a[1] = 79;
        a[2] = 13;
        a[3] = 45;
        a[4] = 22;
/*
        for (int v : a) {
            System.out.println(v);
        }   */

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }

}