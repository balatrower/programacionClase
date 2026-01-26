package B800_VARIOS;

public class E825POTENCIA {
    void main() {
        int base;
        int exponente;
        do {
            base = Integer.parseInt(IO.readln("Escribe numero positivo entero que sera la base de la potencia: "));
            exponente = Integer.parseInt(IO.readln("Escribe numero positivo entero que sera el exponente de la potencia: "));
        } while (base < 0 || exponente < 0);
        IO.println("El resultado de lo potencia con base " + base + " y exponente " + exponente + " es: " + potencia(base, exponente));
    }

    int potencia(int b, int e) {
        if (b == 0) {
            return 0;
        } else if (e == 0) {
            return 1;
        } else {
            return b * potencia(b, e - 1);
        }
    }
}
