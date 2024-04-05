package tools;


public class Calculadora {

    // multiples parametros
    public int suma(int... numeros) { // int[] numeros es un arreglo
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public float suma(float... numeros) { // float[] numeros es un arreglo
        float suma = 0;
        for (float numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public double suma(double... numeros) { // double[] numeros es un arreglo
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma;
    }
}
