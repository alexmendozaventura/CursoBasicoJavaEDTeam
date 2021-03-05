class Tipos{
    //Implementación y uso de casting
    public static void main(String[] args) {
        byte a = 8;
        byte b = 2;
        byte c= (byte)(a + b);
        System.out.println(c);
        //Casting primera forma
        float a1 = (float)10.5;
        float b1 = (float)1.5;
        float c1 = a1 + b1;
        System.out.println(c1);

        //Casting segunda forma
        float a2 = 10.5f;
        float b2 = 1.5f;
        float c2= a2 + b2;
        System.out.println(c2);

    }
}