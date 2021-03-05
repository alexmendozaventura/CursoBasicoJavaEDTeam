public class CicloDoWhile{

    public static void main(String[] args) {
        //do while
        //break detiene el ciclo
        //continue: no va a ejecutar el codigo del bloque del ciclo
        //que este luego de la palabra reservada
       /*
        int i = 10;
        do{
            System.out.println(i);
            i++;
        }
        while(i < 10);
        */

        //break
      /* int i = 0;
        do{
            System.out.println(i);
            i++;
            if(i == 7){
                break;
            }
           
        }
        while(i < 10);
        */
        //continue
        int i = 0;
        do{
            System.out.println(i);
            i++;
            if(i == 7){
                continue;
            }
            System.out.println("Estoy despues del continue " + i);
        }
        while(i < 10);
    }

}