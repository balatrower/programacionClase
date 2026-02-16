package B300_OOPBASICA.E335BINGOCONMAINCOMPLETO;

import java.util.ArrayList;

public class Carton {
    private ArrayList<Integer> numeros;
    private ArrayList<Boolean> marcados;
    private Bombo bombo;

    Carton(Bombo bombo) {
        setBombo(bombo);
        setMarcados(new ArrayList<>());
        setNumeros(new ArrayList<>());
        inicializarMarcados(15);
        rellenarAleatoriamente(15);
    }

    public void setBombo(Bombo bombo) {
        this.bombo = bombo;
    }

    public Bombo getBombo() {
        return bombo;
    }

    public void setMarcados(ArrayList<Boolean> marcados) {
        this.marcados = marcados;
    }

    public ArrayList<Boolean> getMarcados() {
        return marcados;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        ArrayList<Integer> dentro = new ArrayList<>();
        ArrayList<Integer> fuera = new ArrayList<>();

        for (int i = 0; i < getNumeros().size(); i++) {
            if (getMarcados().get(i)) {
                fuera.add(getNumeros().get(i));
            } else {
                dentro.add(getNumeros().get(i));
            }
        }

        return "Han salido los numeros: " + fuera + " Y no han salido los numeros: " + dentro;
    }

    private void rellenarAleatoriamente(int longitudCarton) {
        int cantidadRellenados = 0;
        do {
            double numeroRandomEnLimiteDouble = Math.random() * (getBombo().getTotalBolas());
            int numeroRandomEnLimite = (int) numeroRandomEnLimiteDouble + 1;

            if (!(getNumeros().contains(numeroRandomEnLimite))) {
                getNumeros().add(numeroRandomEnLimite);
                cantidadRellenados++;
            }

        } while (cantidadRellenados < longitudCarton);
    }

    public void anotaBola(int bola) {
        int indice = getNumeros().indexOf(bola);

        if (indice != -1) {
            getMarcados().set(indice, true);
        }
    }

    public boolean hayBingo() {
        boolean bingo = true;

        for (boolean bola: marcados) {
            if (!bola) {
                bingo = false;
                break;
            }
        }

        return bingo;
    }

    private void inicializarMarcados(int longitudCarton) {
        for (int i = 0; i < longitudCarton; i++) {
            getMarcados().add(i, false);
        }
    }
}
