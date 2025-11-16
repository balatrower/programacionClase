package ProgramacionClase;

public class E080DIASENUNMES {
    void main() {
        int mesDado = 0;
        int anyoDado = 0;

        while (mesDado <= 0 || mesDado > 12) {
            IO.println("Introduce un mes para contar sus dias");
            mesDado = pedirNumeroPositivoEnteroConControlDeErrores();
        }

        while (anyoDado <= 0) {
            IO.println("Introduce un año para calcular si es bisiesto y poder contar los dias del mes mas efectivamente");
            anyoDado = pedirNumeroPositivoEnteroConControlDeErrores();
        }

        IO.println("El mes del año dado tiene " + contarDiasMes(mesDado, anyoDado));
    }

    int contarDiasMes(int mes, int anyo) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (calcularBisiesto(anyo)) {
                    return 29;
                }
                return 28;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
        }
        return 0;
    }

    boolean calcularBisiesto(int anyo) {
        if (anyo % 4 == 0) {
            if (anyo % 100 == 0) {
                return anyo % 400 == 0;
            }
            return true;
        }
        return false;
    }

    int pedirNumeroPositivoEnteroConControlDeErrores() {
        int numeroPedido = 0;
        while (numeroPedido <= 0) {
            try {
                numeroPedido = Integer.parseInt(IO.readln("Introduce un numero entero positivo: "));
            } catch (Exception enrique) {
                IO.println("No se permite texto ni numeros negativos o 0, intentelo de nuevo.");
            }
        }
        return numeroPedido;
    }
}