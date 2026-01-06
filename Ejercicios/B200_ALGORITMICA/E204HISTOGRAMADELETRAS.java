package B200_ALGORITMICA;

public class E204HISTOGRAMADELETRAS {
    void main() {
        String fraseFormateada = formatearFrase(pedirFraseUsuario());


        IO.println("Quieres el histograma en vertical o horizontal (V/H)");
        char respuesta = IO.readln().toLowerCase().charAt(0);
        if (respuesta == 'v') {
            dibujarHistogramaVertical(fraseFormateada);
        } else {
            dibujarHistogramaHorizontal(fraseFormateada);
        }
    }

    public static String pedirFraseUsuario() {
        String fraseUsuario = "";
        IO.println("Escribe una frase: (No uses tildes, ni dieresis ni enyes que el intellij no me las soporta idk why) ");
        do {
            fraseUsuario = IO.readln();
        } while (fraseUsuario.isBlank());
        return fraseUsuario;
    }

    public static String formatearFrase(String fraseAFormatear) {
        char[] caracteresAQuitar = {';', ':', '.', ',', '-', '_', '=', '+', '"', '(', ')', '[', ']', '{', '}', ' '};
        StringBuilder fraseFormateada = new StringBuilder();
        for (char caracterActual : fraseAFormatear.toLowerCase().toCharArray()) {
            boolean esCaracterProhibido = false;
            for (char letraExcluidaActual : caracteresAQuitar) {
                if (caracterActual == letraExcluidaActual) {
                    esCaracterProhibido = true;
                    break;
                }
            }
            if (!esCaracterProhibido) {
                fraseFormateada.append(caracterActual);
            }
        }
        return fraseFormateada.toString();
    }

    public static char[] crearAbecedario() {
        char[] abecedario = new char[26];

        for (int i = 0; i < 26; i++) {
            abecedario[i] = (char) (i + 97);
        }
        return abecedario;
    }

    public static char[] devolverArrayCaracteresOrdenadoDeUnaFraseFormateada(String fraseFormateada) {
        char[] abecedario = crearAbecedario();
        char[] arrayLetrasOrdenadas = new char[fraseFormateada.length()];

        int contadorLetrasOrdenadas = 0;
        for (char letraAbecedarioActual : abecedario) {
            for (char caracterActual : fraseFormateada.toCharArray()) {
                if (caracterActual == letraAbecedarioActual) {
                    arrayLetrasOrdenadas[contadorLetrasOrdenadas] = caracterActual;
                    contadorLetrasOrdenadas++;
                }
            }
        }

        return arrayLetrasOrdenadas;
    }

    public static void dibujarHistogramaVertical(String fraseFormateada) {
        char[] abecedario = crearAbecedario();

        for (char letraActual : abecedario) {
            IO.print(letraActual + " ");
            for (char caracterActualFrase : fraseFormateada.toCharArray()) {
                if (letraActual == caracterActualFrase) {
                    IO.print("*");
                }
            }
            IO.print("\n");
        }
    }

    public static void dibujarHistogramaHorizontal(String fraseFormateada) {
        char[] abecedario = crearAbecedario();
        int[] arrayCantidadAparicionesLetra = sacarCantidadAparicionesCadaLetraEnFrase(fraseFormateada);
        int mayorCantidadApariciones = sacarNumeroMaximoApariciones(arrayCantidadAparicionesLetra);

        for (int i = 0; i < mayorCantidadApariciones; i++) {
            IO.print("|");
            for (int j = 0; j < abecedario.length; j++) {
                int valorLetraActual = arrayCantidadAparicionesLetra[j];
                if (valorLetraActual == mayorCantidadApariciones - i) {
                    IO.print("*|");
                    arrayCantidadAparicionesLetra[j] = arrayCantidadAparicionesLetra[j] - 1;
                } else {
                    IO.print(" |");
                }
            }
            IO.print("\n");
        }

        //imprimir leyenda histograma
        IO.print("|");
        for (char letraActual : abecedario) {
            IO.print(letraActual + "|");
        }
        IO.print("\n");
    }

    public static int sacarNumeroMaximoApariciones(int[] arrayASacarValor) {
        int valorMaximo = 0;
        for (int valorActual : arrayASacarValor) {
            if (valorActual > valorMaximo) {
                valorMaximo = valorActual;
            }
        }
        return valorMaximo;
    }

    public static int[] sacarCantidadAparicionesCadaLetraEnFrase(String frase) {
        char[] abecedario = crearAbecedario();
        int[] arrayCantidadApariciones = new int[abecedario.length];
        char[] arrayLetrasAparecenFraseOrdenadas = devolverArrayCaracteresOrdenadoDeUnaFraseFormateada(frase);

        for (int i = 0; i < abecedario.length; i++) {
            char letraActual = abecedario[i];
            int contadorLetraActual = 0;
            for (char letraAProcesar : arrayLetrasAparecenFraseOrdenadas) {
                if (letraAProcesar == letraActual) {
                    contadorLetraActual++;
                }
            }
            arrayCantidadApariciones[i] = contadorLetraActual;
        }

        return arrayCantidadApariciones;
    }
}
