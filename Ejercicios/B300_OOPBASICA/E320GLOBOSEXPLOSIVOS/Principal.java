package B300_OOPBASICA.E320GLOBOSEXPLOSIVOS;

public class Principal {
    void main() {
        Globo g1 = new Globo(25);
        Globo g2 = new Globo();
        Globo g3 = new Globo();
        Globo g4 = new Globo();
        Globo g5 = new Globo();
        Interfaz ui = new Interfaz(g1, g2, g3, g4, g5);
        ui.empezar();
    }
}
