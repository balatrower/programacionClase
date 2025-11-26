package B000_CONTROL;

public class E007SUMARMAYORESQUE100 {
    void main() {
        int resultado = 0;
        int numeroDado = 1;
        while (numeroDado != 0) {
            numeroDado = Integer.parseInt(IO.readln("Introduce un numero, numero 0 sale del bucle: "));

            if (numeroDado == 33) {
                IO.println("ALAN");
            }

            if (numeroDado > 100) {
                resultado += numeroDado;
            }
        }
        IO.println("La suma de los numeros mayores que 100 es: " + resultado);
    }
}