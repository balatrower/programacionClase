package B300_OOPBASICA.E332BINGOBOMBOCARTON;

public class Principal {
    void main() {
        Bombo b = new Bombo(25);
        Carton c = new Carton(b);

        IO.println("Metodos toString de bombo y carton: ");
        IO.println(b);
        IO.println(c);
    }

}
