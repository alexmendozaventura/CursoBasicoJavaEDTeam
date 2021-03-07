
public class Burbuja {
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
        System.out.println ("");
        //Ordenar por el metodo burbuja
        //1. Recorrer el arreglo tantas veces como elementos contenga -1
        //Si el arreglo tiene 10 elementos voy  a recorrerlo 9 veces

        //2. En cada recorrido comparo el elemento actual con el elemento siguiente para saber si estan ordenados,
        //si no lo estan se ordena

        //original: 5,6,9,1,14,12
        //1:        5,6,1,9,12,14
        //2:        5,1,6,9,12,14
        //3:        1,5,6,9,12,14
        //4:        1,5,6,9,12,14
        //5:        1,5,6,9,12,14

        //Código método Burbuja
        for(int recorrido = 0; recorrido < a.length -1; recorrido++ ){
            for(int elemento = 0; elemento < a.length -1; elemento++){
                if(a[elemento] > a[elemento +1 ]){
                    int t = a[elemento];
                    a[elemento] = a[elemento +1];
                    a[elemento +1] = t;
                }
            }
            
        }

        //Mostrar el arreglo ya ordenado
        for(int v : a){
            System.out.print(v + " ");

        }
        System.out.print ("");

    }
}
