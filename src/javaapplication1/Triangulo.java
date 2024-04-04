public class Triangulo extends Figura {
    float base;
    float altura;


    @Override
    public float area() {
        return (base * altura) / 2;
    }
}
