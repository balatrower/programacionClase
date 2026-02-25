package B400_OOPAVANZADA.E400FIGURAS;

public class Principal {
    static void main(String[] args) {
        // Error porque es abstracta
        // Figura f1 = new figura();
        Figura f2 = new Circulo(7.59);
        Figura f3 = new Rectangulo(3.45, 8.91);
        Figura f4 = new Cuadrado(6.72);
        Circulo c1 =  new Circulo(5.55);
        // Circulo c2 = new Figura(); Error
        // Porque es abstracta y no se puede crear un objeto por el abstract
        Rectangulo r1 = new Rectangulo(9.05, 7.64);

        System.out.println(c1.calcularArea());
        System.out.println(f3.calcularArea());

        Figura[] figuras = new Figura[3];
        figuras[0] = f3;
        figuras[1] = c1;
        figuras[2] = r1;

        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
        }
    }
}
