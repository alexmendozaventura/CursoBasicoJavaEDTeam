public class Persona {
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;

    //Constructor
    public Persona(){
        //Sirve para inicilizar los valores de un objeto instanciado
        this.nombre = "";
        this.edad = 0;
        this.peso = 0f;
        this.estatura = 0f;
    }
    //Segundo constructor
    //sobrecarga: escribir un metodo con el mismo nombre
    //pero con diferente firma
    public Persona(String nombre, int edad, float peso, float estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    public Persona(String nombre){
        this.nombre = nombre;
        saludar();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        if (edad < 0 || edad > 150){
            System.out.println("La edad no es valida");
        }
        else{
            this.edad = edad;
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    void saludar(){
        System.out.println("Mi nombre es " + this.nombre);
    }
}
