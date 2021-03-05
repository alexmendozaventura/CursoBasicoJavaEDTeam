public class Operadores {
    public static void main(String[] args) {
        // Asignación
       /* int a = 2;
        int b;
        b = 2 + 2 + 3;
        System.out.println(b);*/

        //Preincremento
       /* int a = 0;
        ++a;
         System.out.println(a);*/

         //Postincremento
        /*int b = 0;
         b++;
         System.out.println(a);*/

         //preincremento vs postincremento
         int a1 = 3, b1=2 ;
         int c1 = a1 * ++b1;
         System.out.println("a1 " + a1);
         System.out.println("b1 " + b1);
         System.out.println("c1 "+c1);

         int a2 = 3, b2=2 ;
         int c2 = a2 *b2++;
         System.out.println("a2 "+a2);
         System.out.println("b2 "+b2);
         System.out.println("c2 "+c2);
         //a = 2 
         // c = multiplica 3 x 2 luego aumenta +1 a b

         //Recomendacion nunca usar preincremento o post incremento dentro de una asignacion


         //Operadores aritmeticos
         //+-*/
         //Jerarquia
         //Operador .(POO), operador ()
         //Primero * / (con prioridad de izquierda a derecha )
         //Segundo  +- (con prioridad de izquierda a derecha)
         int o = 3 + 3 *3 -3 ;
         System.out.println(o);
         int s = (3 + 3) * 3 - 3;
         System.out.println(s);

         //Operadores logicos
         // Y O
         // Tabla de verdad de Y(&&)
         //A        B       Resultado
         //true     true    true    
         //true     false   false   
         //false    true    false    
         //false    false   false    
       
         int edad = 12;
         boolean ninez = edad <= 11 && edad >= 0;
         System.out.println(ninez);
         // Tabla de verdad de o (||)
         //A        B       Resultado
         //true     true    true    
         //true     false   true   
         //false    true    true    
         //false    false   false    

         
    }
}
