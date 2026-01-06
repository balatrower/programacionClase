package B200_ALGORITMICA;

public class E209CALCULADORA {
    void main() {
        boolean deseoSalir = false;
        do {
            IO.println("Que desea hacer: (-1 Salir, 1 Suma, 2 Resta, 3 Multiplicacion, 4 Division, 5 calcular potencia");
            int idOperacion = pedirNumeroAlUsuarioConControlErrores();

            if (idOperacion == -1) {
                deseoSalir = true;
                continue;
            }

            switch (idOperacion) {
                case 1 -> operacionSuma();
                case 2 -> operacionResta();
                case 3 -> operacionMultiplicacion();
                case 4 -> operacionDivison();
                case 5 -> operacionPotencia();
            }

        } while (!deseoSalir);

        IO.println("Gracias por usar la calculadora de agartha");
    }

    public void operacionPotencia() {
        IO.println("Escribe la base de la potencia: ");
        int base = pedirNumeroAlUsuarioConControlErrores();

        IO.println("Escribe el exponente de la potencia: ");
        int exponente = pedirNumeroAlUsuarioConControlErrores();

        int resultado = 0;
        for (int i = 0; i < exponente; i++) {
            resultado = resultado + base;
        }

        IO.println("El resultado de la potencia: " + resultado);
    }

    public void operacionDivison() {
        IO.println("Escribe el dividendo: ");
        double dividendo = pedirNumeroAlUsuarioConControlErrores();

        IO.println("Escribe el divisor: ");
        double divisor = pedirNumeroAlUsuarioConControlErrores();

        IO.println("El resultado de la resta es: " + (dividendo / divisor) + " y su resto es: " + (dividendo % divisor));
    }

    public void operacionMultiplicacion() {
        IO.println("Escribe el multiplicando: ");
        int multiplicando = pedirNumeroAlUsuarioConControlErrores();

        IO.println("Escribe el multiplicador: ");
        int multiplicador = pedirNumeroAlUsuarioConControlErrores();

        IO.println("El resultado de la multiplicacion es: " + (multiplicando * multiplicador));
    }

    public void operacionResta() {
        IO.println("Escribe primer numero de la resta: ");
        int numero1 = pedirNumeroAlUsuarioConControlErrores();

        IO.println("Escribe segundo numero de la resta: ");
        int numero2 = pedirNumeroAlUsuarioConControlErrores();

        IO.println("El resultado de la resta es: " + (numero1 - numero2));
    }

    public void operacionSuma() {
        IO.println("Escribe primer numero de la suma: ");
        int numero1 = pedirNumeroAlUsuarioConControlErrores();

        IO.println("Escribe segundo numero de la suma: ");
        int numero2 = pedirNumeroAlUsuarioConControlErrores();

        IO.println("El resultado de la suma es: " + (numero1 + numero2));
    }

    public int pedirNumeroAlUsuarioConControlErrores() {
        int numeroUsuario = 0;
        while (numeroUsuario == 0) {
            try {
                numeroUsuario = Integer.parseInt(IO.readln());
            } catch (Exception enrique) {
                IO.println("No se admite esa respuesta, por favor escriba una respuesta valida");
            }
        }

        return numeroUsuario;
    }
}