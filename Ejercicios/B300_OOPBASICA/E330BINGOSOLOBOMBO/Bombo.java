package B300_OOPBASICA.E330BINGOSOLOBOMBO;

import java.util.ArrayList;

public class Bombo {
    private int[][] bolas;

    public Bombo(int cantidadBolas) {
        inicializarBolas(cantidadBolas);
    }

    public void setBolas(int[][] bolas) {
        this.bolas = bolas;
    }

    public int[][] getBolas() {
        return bolas;
    }

    @Override
    public String toString() {
        ArrayList<Integer> fuera = new ArrayList<>();
        ArrayList<Integer> dentro = new ArrayList<>();
        int[][] bolas = getBolas();

        for (int i = 0; i < bolas[0].length; i++) {
            if (bolas[1][i] == 0) {
                dentro.add(bolas[0][i]);
            } else {
                fuera.add(bolas[0][i]);
            }
        }

        return "Quedan por salir las bolas: " + dentro + " y han salido ya las bolas: " + fuera;
    }

    private void inicializarBolas(int cantidadBolas) {
        setBolas(new int[2][cantidadBolas]);
        int[][] bolas = getBolas();
        for (int i = 0; i < bolas[0].length; i++) {
            bolas[0][i] = i + 1; //valor 1 hasta bolas.length + 1 ya que bingo no usa 0
            bolas[1][i] = 0; //0 no ha salido, 1 ha salido
        }
        setBolas(bolas); //si no, los cambios en el array no se guardan
    }

    public int dameBola() {
        int[][] bolas = getBolas();
        int numeroBola = 0; //numeroBola = 1 hasta bolas.length, usado para valor bola
        int indiceBola = 0; //indiceBola = 0 hasta bolas.length - 1, usado para indices dentro de array bolas

        do {
            double indiceBolaDouble = Math.random() * bolas[0].length;
            indiceBola = (int) indiceBolaDouble; //separado el typecast, si no da 0
        } while (haSalido(indiceBola));

        numeroBola = bolas[0][indiceBola];
        bolas[1][indiceBola] = 1; //marcar salida
        return numeroBola;
    }

    private boolean haSalido(int indiceBola) {
        return bolas[1][indiceBola] == 1;
    }
}
