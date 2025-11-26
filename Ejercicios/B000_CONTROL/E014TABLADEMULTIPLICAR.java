package B000_CONTROL;

public class E014TABLADEMULTIPLICAR {
    void main() {
        int numero = 0;
        while (true) {
            numero = Integer.parseInt(IO.readln("Introduce un numero para dar su tabla de multiplicar: "));

            if (!(numero <= 0)) {
                break;
            }

            IO.println("Escribe un numero positivo no decimal que no sea cero!! ");
            IO.println();
        }

        for (int i = 1; i <= 10; i++) {
            int resultado = i * numero;
            System.out.format("%d x %d = %d \n", i, numero, resultado);
        }

        double raizCuadrada = Math.sqrt(numero);
        System.out.format("√%d = %f", numero, raizCuadrada);
    }
}