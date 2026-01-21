package B300_OOPBASICA.E303CONTADORCONPASOYREDONDEO;

public class Principal {
    void main() {
        Contador c1 = new Contador(); // Valor inicial por defecto 0, paso por defecto 1, no redondeo.
        Contador c2 = new Contador(77); // Valor inicial 77, paso por defecto 1, no redondeo.
        Contador c3 = new Contador(77, 5); // Valor inicial 77, paso 5, no redondeo.
        Contador c4 = new Contador(77, 5, true); // Valor inicial (redondeado) 75, paso 5, sí redondeo.

        IO.println("Incrementar sin argumentos, sin redondeo, sin paso y sin valor inicial: ");
        IO.println(c1.getValor());
        c1.incrementar();
        IO.println(c1.getValor());
        IO.println();

        IO.println("Incrementar sin argumentos, sin redondeo, sin paso y con valor inicial: ");
        IO.println(c2.getValor());
        c1.incrementar();
        IO.println(c2.getValor());
        IO.println();

        IO.println("Incrementar sin argumentos, sin redondeo, con paso y con valor inicial: ");
        IO.println(c3.getValor());
        c1.incrementar();
        IO.println(c3.getValor());
        IO.println();

        IO.println("Incrementar sin argumentos, con redondeo, con paso y con valor inicial: ");
        IO.println(c4.getValor());
        c1.incrementar();
        IO.println(c4.getValor());
        IO.println();
    }
}
