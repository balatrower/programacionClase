package B400_OOPAVANZADA.E401FIGURASDECOLORES;

public class Principal {
    static void main(String[] args) {
        Figura f1 = new Circulo(70);
        Figura f2 = new Cuadrado(20);
        Figura f3 = new Rectangulo(23, 45);
        Circulo c1 = new Circulo(60);
        Cuadrado q2 = new Cuadrado(30);
        Rectangulo r3 = new Rectangulo(26, 67);

        System.out.println(q2.getLado());
        q2.setBase(8.45);
        System.out.println(q2.getLado());

        Figura[] figuras = new Figura[6];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = c1;
        figuras[4] = q2;
        figuras[5] = r3;

        double areaTotal = 0;
        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
            areaTotal = areaTotal + figura.calcularArea();
        }

        System.out.println(areaTotal);
    }
}