
public class Perro extends Mascota {

    public Perro(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    @Override
    public void dormir() {
        super.dormir();
        System.out.println("Zzzz editado");
    }
}
