package B300_OOPBASICA.E330BINGOSOLOBOMBO;

public class Principal {
    void main() {
        Bombo b = new Bombo(25);
        IO.println(b);
        int bola = b.dameBola();
        IO.println("Ha salido la bola: " + bola);
        bola = b.dameBola();
        IO.println("Ha salido la bola: " + bola);
        bola = b.dameBola();
        IO.println("Ha salido la bola: " + bola);
        bola = b.dameBola();
        IO.println("Ha salido la bola: " + bola);
        bola = b.dameBola();
        IO.println("Ha salido la bola: " + bola);
        IO.println(b);
    }
}
