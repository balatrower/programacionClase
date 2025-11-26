package B000_CONTROL;

public class E009NUMEROALREVES {
    void main() {
        int numero = Integer.parseInt(IO.readln("Introduce un numero: "));

        String numeroString = String.valueOf(numero);

        String stringFinal = "";
        for (int i = 0; i < numeroString.length(); i++) {
            stringFinal = stringFinal.concat(String.valueOf(numeroString.charAt(numeroString.length() - 1 - i)));
        }

        int numeroFinal = Integer.parseInt(stringFinal);

        System.out.format("Numero invertido: %d", numeroFinal);
    }
}