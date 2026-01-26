package B800_VARIOS;

public class E821FACTORIALRECURSIVO {
    void main() {
        int numero = -1;
        do {
            numero = Integer.parseInt(IO.readln("Escribe numero positivo entero del que calcular su factorial: "));
        } while (numero < 0);
        IO.println("El factorial de " + numero + " es: " + factorial(numero));
    }

    int factorial(int valor) {
        if (valor == 0) {
            return 1;
        } else {
            return valor * factorial(valor - 1);
        }
    }
}
