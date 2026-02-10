package B300_OOPBASICA.E325FRASE;

import java.awt.image.ImagingOpException;

public class Principal {
    void main(String[] args) {
        Frase f = new Frase(4, "Holiwis"); //constructor con repeticiones
        Frase e = new Frase("Shalom "); // frase con espaco al final
        Frase r = f.clone(); // clon del primero
        Frase n = new Frase(); // frase vacia

        IO.println("Equals");
        if (f.equals(e)) {
            IO.println("Son iguales");
        } else {
            IO.println("No son iguales");
        }

        if (f.equals(r)) {
            IO.println("Son iguales");
        } else {
            IO.println("No son iguales");
        }

        IO.println("");
        IO.println("Prueba metodos: ");
        IO.println(f);
        f.anexar("Nuevo texto");
        IO.println(f);
        IO.println(n);
        n.anexar("Nuevo teto anexar");
        IO.println(n);

        IO.println(e);
        e.recortar(3);
        IO.println(e);
        e.recortar(2);
        IO.println(e);

        IO.println(r);
        IO.println("La longitud de la anterior frase es: " + r.longitud());
        IO.println("El caracter en el indice 3 de la anterior frase es:" + r.caracterEn(3));
    }
}
