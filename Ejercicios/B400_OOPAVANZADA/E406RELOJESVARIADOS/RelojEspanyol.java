package B400_OOPAVANZADA.E406RELOJESVARIADOS;

public class RelojEspanyol extends RelojTextual {
    public RelojEspanyol() {
        super();
    }

    public RelojEspanyol(int h, int m) {
        super(h, m);
    }

    @Override
    public String toString() {
        String[] unidades = {"cero", "una", "dos", "tres", "cuatro", "cinco", "seis", "siete",
                "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince"};
        String[] decenas = {"", "dieci", "veinti","treinta", "cuarenta", "cincuenta"};

        String horasTexto = sacarHoras(unidades, decenas);
        String minutosTexto = sacarMinutos(unidades, decenas);

        return horasTexto + minutosTexto;
    }

    private String sacarMinutos(String[] unidades, String[] decenas) {
        //sacar minutos en texto
        int minutos = this.getM();
        String minutosTexto;

        //caso aislado de los primeros 15 digitos
        if (minutos < 16) {
            if (minutos == 1) minutosTexto = "un minuto."; // caso especial 1 minuto masculino
            else minutosTexto = unidades[minutos] + " minutos.";
            return minutosTexto;
        }

        // para los demas casos sacar primer digito
        //estos dos son casos de veinti y dieci que van junt al segundo digito, ej: ventiseis.
        else if (minutos < 20) minutosTexto = decenas[1] + unidades[minutos % 10] + " minutos.";
        //caso especifico 20 minutos
        else if (minutos == 20) minutosTexto = "veinte minutos.";
        else if (minutos < 30) {
            int segunoDigito = minutos % 10;
            if (segunoDigito == 1) {
                minutosTexto = decenas[2] + "un minutos."; // caso especifico 21 minutos debido al un
            } else minutosTexto = decenas[2] + unidades[minutos % 10] + " minutos."; // caso normal
        }

        // caso separado para numeros que van separados por y, ej: teinta y tres
        else {
            minutosTexto = decenas[minutos / 10]; //sacar primer digito alineado en el array 5 es 50, etc...

            // sacar segundo digito
            int segunoDigito = minutos % 10;
            //caso de segundo digito terminando en 1
            if (segunoDigito == 1) {
                minutosTexto = minutosTexto + " y " + "un minutos.";
            }
            // caso de segundo digito terminado en 0
            else if (segunoDigito == 0) minutosTexto = minutosTexto + " minutos.";
            // caso normal
            else minutosTexto = minutosTexto + " y " + unidades[minutos % 10] + " minutos.";
        }

        return minutosTexto;
    }

    private String sacarHoras(String[] unidades, String[] decenas) {
        //sacar horas en texto
        int horas = this.getH();
        String horasTexto;

        //primer digito
        if (horas < 16) {
            if (horas == 1)horasTexto = unidades[horas] + " hora, "; //caso especial del 1
            else horasTexto = unidades[horas] + " horas, ";
        }
        else if (horas < 20) horasTexto = decenas[1];
        else if (horas == 20) horasTexto ="veinte horas, ";
        else horasTexto = decenas[2];

        //segundo digito
        int segundoDigitoHoras = horas % 10;
        if (segundoDigitoHoras != 0 && horas > 15) horasTexto = horasTexto + unidades[segundoDigitoHoras] + " horas, ";
        return horasTexto;
    }
}
