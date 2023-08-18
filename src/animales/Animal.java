package animales;

public class Animal    {

    //Atributos
    String nombre;
    String color;
    double peso;
    double tamano;

    //Metodos constructores
    public Animal() {}

    public Animal(String nombre, String color, double peso, double tamano) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tamano = tamano;
    }

    //GET SET

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamano() {
        return tamano;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    //Comportamientos
    public String comer(){
        return "El animal está comiendo";
    };
    public String dormir(){
        return "El animal está durmiendo";
    };
    public String moverse(){
        return "El animal se está moviendo";
    };
}
