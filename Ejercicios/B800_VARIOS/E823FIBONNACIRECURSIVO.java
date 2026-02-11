package B800_VARIOS;

public class E823FIBONNACIRECURSIVO {
    void main() {
        int numero = -1;
        do {
            numero = Integer.parseInt(IO.readln("Escribe numero positivo entero del que calcular su sucesion de fibonacci: "));
        } while (numero < 0);
        IO.println("El resultado de la succesion de fibonacci de " + numero + " es: " + fibonnaci(numero));
    }

    int fibonnaci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonnaci(n - 1) + fibonnaci(n - 2);
        }
    }
}
