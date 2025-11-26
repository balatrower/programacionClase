package B000_CONTROL;

public class E044NUMEROSENRANGO {
    void main() {
        int numeroDado1 = -20;
        int numeroDado2 = 40;

    /* PARTE PRIMERA
        for (int i = numeroDado1; i <= numeroDado2; i++) {
            IO.println(i);
        }
     */

        //encontrar el multiplo de 3 mas cercano en el rango al primer numero
        int numeroCercanoAlPrimerDadoMultiplo3 = 0;
        for (int i = numeroDado1; i <= numeroDado1 + 2; i++) {
            if (Math.abs(i) % 3 == 0) {
                numeroCercanoAlPrimerDadoMultiplo3 = i;
            }
        }

        //encontrar el multiplo de 3 mas cercano en el rango al segundo numero
        int numeroCercanoAlSegundoDadoMultiplo3 = 0;
        for (int i = numeroDado2; i >= numeroDado2 - 2; i--) {
            if (Math.abs(i) % 3 == 0) {
                numeroCercanoAlSegundoDadoMultiplo3 = i;
            }
        }

        do {
            IO.println(numeroCercanoAlPrimerDadoMultiplo3);
            numeroCercanoAlPrimerDadoMultiplo3 = numeroCercanoAlPrimerDadoMultiplo3 + 3;
        } while (numeroCercanoAlPrimerDadoMultiplo3 != numeroCercanoAlSegundoDadoMultiplo3 + 3);
    }
}