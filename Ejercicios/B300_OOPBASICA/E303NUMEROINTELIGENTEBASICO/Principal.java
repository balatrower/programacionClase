package B300_OOPBASICA.E303NUMEROINTELIGENTEBASICO;

public class Principal {
    void main() {
        NumeroInteligente numerazo = new NumeroInteligente(55);
        IO.println(numerazo.getValor());
        numerazo.incrementar();
        IO.println(numerazo.getValor());
        numerazo.incrementar(55);
        IO.println(numerazo.getValor());
        numerazo.decrementar();
        IO.println(numerazo.getValor());
        numerazo.decrementar(77);
        IO.println(numerazo.getValor());


        IO.println();


        NumeroInteligente numerete = new NumeroInteligente();
        do {
            if (numerete.esPrimo()) {
                IO.println("El numero: " + numerete.getValor() + " es primo.");
            } else {
                IO.println("El numero: " + numerete.getValor() + " NO es primo.");
            }
            numerete.incrementar();
        } while (numerete.getValor() <= 100);


        IO.println();


        NumeroInteligente numerico = new NumeroInteligente();
        do {
            if (numerico.esPerfecto()) {
                IO.println("El numero: " + numerico.getValor() + " es perfecto.");
            } else {
                IO.println("El numero: " + numerico.getValor() + " NO es perfecto.");
            }
            numerico.incrementar();
        } while (numerico.getValor() <= 100);
    }
}
