package ProgramacionClase;

import java.lang.IO;
import java.lang.Math;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class E012DIVISIONSIMPLE extends Application {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt(IO.readln("Ingrese dividendo: "));
        int dividendoResto = dividendo;

        int divisor = Integer.parseInt(IO.readln("Ingrese divisor: "));
        int divisorResto = divisor;

        int cociente = 0;
        while (dividendo > 0) {
            dividendo -= divisor;
            cociente++;
        }

        int resto = Math.abs(dividendoResto - (divisorResto * cociente));

        IO.println("El cociente es: " + cociente);
        IO.println("El resto es: " + resto);

        IO.println();
        IO.println();
        IO.println();

        launch(E012DIVISIONSIMPLE.class);
    }

    public void start(Stage ventana) {
        int numeroLados = Integer.parseInt(IO.readln("Ingresa el numero de lados: "));

        double radio = 150.0;
        double centroVentanaX = 400;
        double centroVentanaY = 300;
        double anguloPoligono = (double) 360 / (numeroLados); //angulo = 360 / numero de lados
        Double[] arrayVerticesX = new Double[numeroLados];
        Double[] arrayVerticesY = new Double[numeroLados];

        //sacar vertices para el poligonou y meterlos en cada array
        // x = r * coseno(angulo en radianes) + el centro del ciruclo
        // y = r * seno(angulo en radianes) + el centro del ciruclo, es lo mismo pero cambia el seno
        for (int i = 0; i < numeroLados; i++) {
            double anguloPoligonoRadianes = Math.toRadians(i * anguloPoligono);
            double x = radio * Math.cos(anguloPoligonoRadianes) + centroVentanaX;
            double y = radio * Math.sin(anguloPoligonoRadianes) + centroVentanaY;
            arrayVerticesX[i] = x;
            arrayVerticesY[i] = y;
        }

        //añadirle los vertices al poligono
        Polygon poligono = new Polygon();
        for (int i = 0; i < numeroLados; i++) {
            poligono.getPoints().addAll(arrayVerticesX[i], arrayVerticesY[i]);
        }

        poligono.setFill(Color.YELLOW);
        poligono.setStroke(Color.RED);

        Pane raiz = new Pane();
        raiz.getChildren().add(poligono);

        Scene escena = new Scene(raiz, 800, 600);
        ventana.setTitle("Poligono truco");
        ventana.setScene(escena);
        ventana.show();
    }
}
