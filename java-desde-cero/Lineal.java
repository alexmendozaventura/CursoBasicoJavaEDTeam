public class Lineal {
    public static void main(String[] args) {
        //Declaración del arreglo
        int a[] = new int[10];
        //Poblar el arreglo
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 99);

        }
        //Mostrar el arreglo por consola
        for(int v : a){
            System.out.print(v + " ");
        }

        int x = 50;
        a[9] = 50;
        //Busqueda lineal
        for(int i=0; i < a.length; i++){
            if(a[i] == x){
                System.out.println("El numero"+ x +" esta en el indice " +i);
                break;
            }

        }
    }
}
