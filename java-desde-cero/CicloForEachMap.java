import java.util.HashMap;
import java.util.Map;

public class CicloForEachMap{
public static void main(String[] args) {
    Map<Integer, String> nombres = new HashMap<>();
    nombres.put(1,"Alvaro");
    nombres.put(2,"Clarie");
    nombres.put(3,"Alex");
   
    nombres.forEach((id, nombre) -> {
        System.out.println("ID" + id + " Nombre " + nombre);


    });



}

}