package B000_CONTROL;

public class E008CONTARYSUMARDIGITOS {
    void main() {
        int numero = Integer.parseInt(IO.readln("Introduce un numero: "));

    /*
        esto funciona basicamente porque la relacion de los digitos de un numero y la parte entera de su logaritmo de base 10 mas 1
        los digitos de un numero equivalen a la parte entera del logaritmo de base 10 + 1
        ejemplo con 123: log10(123) = 2.089... parte entera = 2, 2 + 1 = 3 digitos del numero
        la relacion es algo como esto 100 <= 123 < 1000 (log10(100) = 2 y log10(1000) = 3, si les sumamos la parte entera salen sus digitos correctamente)
     */
        int numeroDigitos = (int) Math.log10(numero) + 1; //el int es para cojer la parte entera as it is, NO redondear

        int sumador = 0;
        for (int i = 1; i <= numeroDigitos; i++) {
            sumador = sumador + numero % 10;
            numero = numero / 10;
        }

        System.out.format("Tiene %d dígitos y su suma es %d.", numeroDigitos, sumador);
    }
}