package B000_CONTROL;

public class E018ELEFANTES {
    void main() {
        int numeroElefantes = Integer.parseInt(IO.readln("¿Cuantas veces quieres repetir? "));

        if (numeroElefantes < 1) {
            IO.println("No había ningún elefante balanceándose en una hamaca a la orilla de un rio...");
        }

        //Math.round devuelve long por eso el (int)
        int umbral = (int) Math.round(numeroElefantes * 0.75);

        for (int i = 1; i < numeroElefantes + 1; i++) {
            String balanceaban = "balanceaban";
            String elefantes = "elefantes";

            if (i == 1) {
                balanceaban = "balanceaba";
                elefantes = "elefante";
            }

            if (i >= umbral) {
                elefantes = elefantes.toUpperCase();
            }

            System.out.format("Había una vez %d %s que se %s en una hamaca a la orilla de un río...\n", i, elefantes, balanceaban);
        }
    }
}