package B300_OOPBASICA.E302CONTADORCOMPLETOEQUALSCLONE;

public class Principal {
    void main() {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador(13, "Kilos");
        Contador c4 = c3.clone();

        String respuesta = "";
        respuesta = (c1.equals(c1)) ? "son iguales." : "no son iguales.";
        IO.println("Los contadores " + respuesta);

        respuesta = (c2.equals(c3)) ? "son iguales." : "no son iguales.";
        IO.println("Los contadores " + respuesta);

        respuesta = (c3.equals(c4)) ? "son iguales." : "no son iguales.";
        IO.println("Los contadores " + respuesta);
    }
}
