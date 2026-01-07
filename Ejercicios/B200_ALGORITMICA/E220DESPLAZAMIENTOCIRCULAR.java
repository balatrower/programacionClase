package B200_ALGORITMICA;

import module java.base;

public class E220DESPLAZAMIENTOCIRCULAR {
    void main() {
        do {
            IO.println(Arrays.toString(numeros));
            char opcionUsuario = IO.readln("Introduce i para izquierda o d para derecha, o x para salir.\n").toLowerCase().charAt(0);

            if (opcionUsuario == 'x') {
                IO.println("Terminamos con los desplazamientos.");
                break;
            }

            IO.println("Dime cuántos saltos quieres hacer en esa dirección (mínimo 1).");
            int numDesplazamientos = pedirNumeroEnteroUsuarioControlErrores();

            desplazarArray(numDesplazamientos, opcionUsuario);
        } while (true);
    }

    public void desplazarArray(int numDesplazamiento, char direccion) {
        if (direccion == 'd') {
            numDesplazamiento = eliminarDesplazamientosInnecesarios(numDesplazamiento);

            for (int i = 0; i < numDesplazamiento; i++) {
                int auxiliar = numeros[numeros.length - 1];
                for (int j = numeros.length - 1; j > 0; j--) {
                    numeros[j] = numeros[j - 1];
                }
                numeros[0] = auxiliar;
            }
        } else {
            numDesplazamiento = eliminarDesplazamientosInnecesarios(numDesplazamiento);

            for (int i = 0; i < numDesplazamiento; i++) {
                int auxiliar = numeros[0];
                for (int j = 0; j < numeros.length - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
                numeros[numeros.length - 1] = auxiliar;
            }
        }
    }

    public int eliminarDesplazamientosInnecesarios(int numDesplazamiento) {
        if (numDesplazamiento >= numeros.length) {
            if (numDesplazamiento == numeros.length) {
                numDesplazamiento = 0;
            } else {
                numDesplazamiento = numDesplazamiento / numeros.length;
            }
        }
        return numDesplazamiento;
    }

    public int pedirNumeroEnteroUsuarioControlErrores() {
        int numeroUsuario = 0;
        do {
            try {
                numeroUsuario = Integer.parseInt(IO.readln());
            } catch (Exception enrique) {
                IO.println("Error: Numero no valido");
            }
        } while (numeroUsuario <= 0);
        return numeroUsuario;
    }

    private int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
}