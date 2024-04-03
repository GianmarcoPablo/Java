
public class JavaApplication1 {

    public static void main(String[] args) {
        Perro chato = new Perro();
        chato.establecerAtributos("Boby", "chiwawa", 5);


        System.out.println(chato.edad);
        System.out.println(chato.nombre);
        System.out.println(chato.raza);
        chato.comer();
        chato.dormir();
        chato.ladrar(); 
    }

}
