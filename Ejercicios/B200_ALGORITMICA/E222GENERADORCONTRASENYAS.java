package B200_ALGORITMICA;

import module java.base;

public class E222GENERADORCONTRASENYAS {
    void main() {
        Random aleatorio = new Random();
        IO.println("Voy a generar tu contraseña.\n¿Cuántos caracteres quieres que tenga? (Entre 4 y 30)");
        int longitudContrasenya = pedirNumeroEnteroUsuarioControlErrores();

        String grupoCaracteresContrasenya = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char confirmacionEspeciales = IO.readln("¿Te parece bien si aparecen caracteres especiales? (s/n)").toLowerCase().charAt(0);
        if (confirmacionEspeciales == 's') {
            grupoCaracteresContrasenya = grupoCaracteresContrasenya + "#$%&";
        }

        IO.println();

        StringBuilder constructorContrasenya = new StringBuilder();
        for (int i = 0; i < longitudContrasenya; i++) {
            int indiceAleatorio = aleatorio.nextInt(grupoCaracteresContrasenya.length());
            constructorContrasenya.append(grupoCaracteresContrasenya.charAt(indiceAleatorio));
            IO.print("*");
        }
        IO.print("\n");

        String contrasenyaFinal = constructorContrasenya.toString();
        IO.println("Contraseña generada.");

        String respuesta = "";
        do {
            respuesta = IO.readln("Introduce 'ok' para ver la contraseña.\n");
        } while (!(respuesta.equalsIgnoreCase("ok")));

        IO.println("La contraseña genera es " + contrasenyaFinal);
    }

    public int pedirNumeroEnteroUsuarioControlErrores() {
        int numeroUsuario = 0;
        do {
            try {
                numeroUsuario = Integer.parseInt(IO.readln());
            } catch (Exception enrique) {
                IO.println("Error: Numero no valido");
            }
        } while (numeroUsuario < 4 || numeroUsuario > 30);
        return numeroUsuario;
    }
}