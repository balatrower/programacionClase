package B400_OOPAVANZADA.E402ANIMALES;

public class Principal {
    void main() throws InterruptedException {
        Animal[] animales = new Animal[4];

        animales[0] = new Pajaro(50);
        animales[1] = new Perro(35);
        animales[2] = new Gato(25);
        animales[3] = new Lagartija(30);


        while (true) {
            for (Animal animal : animales) {
                int comida = 0;
                if (Math.random() < 0.30) {
                    comida = (int) (Math.random() * 3) + 1;
                    animal.come(comida);
                }
                IO.println(animal.getClass().getSimpleName() + " Ha comido " + comida + " piezas de comida");
                animal.hablar();
            }
            IO.println();
            Thread.sleep(3000);
        }
    }
}
