package ProgramacionClase;

import java.lang.IO;

public class E010MULTIPLICACIONSIMPLE {
    void main() {
        int multiplicando = Integer.parseInt(IO.readln("Ingrese un multiplicando:"));

        int multiplicador = Integer.parseInt(IO.readln("Ingrese un multiplicador:"));

        if (multiplicador < 0 && multiplicando < 0) {
            multiplicador *= -1;
            multiplicando *= -1;
        }

        if (multiplicador < 0) {
            int ayudante = 0;
            ayudante = multiplicador;
            multiplicador = multiplicando;
            multiplicando = ayudante;
        }

        int resultado = 0;
        for (int i = 0; i < multiplicador; i++) {
            resultado += multiplicando;
        }

        IO.println("El resultado de la multiplicacion " + multiplicador + " x " + multiplicando + " es: " + resultado);
    }
}