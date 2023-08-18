import animales.Delfin;
import animales.Gato;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Gato garfield=new Gato("Garfield","negro",2.0,0.75,true);
Delfin delfi=new Delfin();


        System.out.println("Mi gato se llama: "+garfield.getNombre());
        System.out.println(garfield.moverse());
        System.out.println(delfi.moverse());
    }
}