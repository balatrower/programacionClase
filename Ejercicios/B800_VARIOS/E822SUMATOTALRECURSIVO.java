package B800_VARIOS;

public class E822SUMATOTALRECURSIVO {
    void main() {
        int numero = -1;
        do {
            numero = Integer.parseInt(IO.readln("Escribe numero positivo entero del que calcular su suma total: "));
        } while (numero < 0);
        IO.println("La suma total de " + numero + " es: " + sumaTotal(numero));
    }

    int sumaTotal(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaTotal(n - 1);
        }
    }
}
