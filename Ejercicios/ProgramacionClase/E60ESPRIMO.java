package ProgramacionClase;

public class E60ESPRIMO {
    void main() {
        boolean primo = esPrimoOptimizado(pedirNumeroPositivoEnteroConControlDeErrores());

        if (primo) {
            IO.println("El numero escrito es primo");
        } else {
            IO.println("El numero escrito no es primo");
        }
    }

    boolean esPrimoOptimizado(int numero) {
        //numero menor de dos no son primos
        if (numero < 2) {
            return false;
        }

        //2 y 3 son primos
        if (numero == 2 || numero == 3) {
            return true;
        }

        //si es par excepto dos no es primo
        if (numero % 2 == 0) {
            return false;
        }

        //usamos el typecast (int) para omitir los decimales de la raiz cuadrada y asi tener menos lio
        for (int i = 3; i <= (int) Math.sqrt(numero); i += 2) {  //saltarse los pares sumando dos
            if (esDivisible(numero, i)) {
                return false;  //si se encuentra un divisor no es primo, es falso
            }
        }

        return true;
    }

    boolean esDivisible(int dividendo, int divisor) {
        int resultadoDivisible = dividendo % divisor;
        //si es divisible devuelve true al ser un statement
        return resultadoDivisible == 0;
    }

    boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (esDivisible(numero, i)) {
                return false; //si el numero es divisible entre otro que no sea el mismo, no es primo, es falso
            }
        }
        return true;
    }

    int pedirNumeroPositivoEnteroConControlDeErrores() {
        int numeroPedido = 0;
        while (numeroPedido <= 0) {
            try {
                numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero positivo: "));
            } catch (Exception enrique) {
                IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
            }
        }
        return numeroPedido;
    }
}