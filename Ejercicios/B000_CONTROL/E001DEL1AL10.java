package B000_CONTROL;

import java.lang.IO;

public class E001DEL1AL10 {
    void main() {
        for (int i = 1; i <= 10; i++) {
            IO.println(i);
            IO.println(dibujarAsteriscos(i));
        }
    }

    public String dibujarAsteriscos(int i) {
        String cantidadAsteriscos = "";
        for (int j = 1; j <= i; j++) {
            cantidadAsteriscos += "*";
        }
        return cantidadAsteriscos;
    }
}
