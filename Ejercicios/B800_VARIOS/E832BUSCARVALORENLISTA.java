package B800_VARIOS;

import java.util.Arrays;

public class E832BUSCARVALORENLISTA {
    void main() {
        int numeroBuscado = -1;
        int[] lista = {3, 8, 15, 20, 25, 4, 6, 7};
        IO.println("Dada esta lista: " + Arrays.toString(lista));

        do {
            try {
                numeroBuscado = Integer.parseInt(IO.readln("Introduce un numero para buscar en la lista: "));
            } catch (Exception enrique) {
                IO.println("Numero no valido, introduzca otro");
            }
        } while (numeroBuscado < 0);

        IO.println((estaEnLista(numeroBuscado, lista) ? "El numero " + numeroBuscado + " esta en la lista" : "El numero " + numeroBuscado + " no esta en la lista"));
    }

    // esto lo he hecho asi porque he querido, podria haberlo hecho sin este metodo de abajo y haberlo puesto de normal que tengas que meter indice si o si
    // pero cuando solo estas buscando saber si esta el numero en la lista, en main tener que meter la longitud inicial de la lista me parece un poco muermo
    // acabo de ver el .java que esta atached en la entrega, podria borrar todo esto y daria exactamente igual porque asi es como lo has hecho pero bueno
    // lo voy a dejar porque quiero y puedo (si estuviera trabajando en una empresa no dejaria esto obviamente)
    public boolean estaEnLista(int numeroBuscado, int[] lista) {
        return estaEnLista(numeroBuscado, lista, lista.length - 1);
    }

    private boolean estaEnLista(int numeroBuscado, int[] lista, int indice) {
        if (lista[indice] == numeroBuscado) {
            return true;
        } else if (indice == 0) {
            return false;
        } else {
            return estaEnLista(numeroBuscado, lista, indice - 1);
        }
    }
}
