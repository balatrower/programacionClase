package ProgramacionClase;

import java.lang.IO;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class E011MULTIPLICACIONCONNEGATIVOS extends Application {

    public static void main(String[] args) {
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
        launch(E011MULTIPLICACIONCONNEGATIVOS.class);
    }

    public void start(Stage window) {
        Image imagenFondo = new Image(getClass().getResourceAsStream("/resources/imagen.JPG"));
        ImageView fondo = new ImageView(imagenFondo);
        //relacion de aspecto de la foto es 3:2
        fondo.setFitWidth(1075);
        fondo.setFitHeight(717);

        StackPane root = new StackPane(fondo);
        fondo.fitWidthProperty().bind(root.widthProperty());
        fondo.fitHeightProperty().bind(root.heightProperty());

        Scene scene = new Scene(root, 1075, 717);
        window.setTitle("Foto tomada por mi en el Rally Ciudad de Getafe 2025");
        window.setScene(scene);
        window.show();
    }
}