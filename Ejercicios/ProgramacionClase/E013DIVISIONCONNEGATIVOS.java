package ProgramacionClase;

public class E013DIVISIONCONNEGATIVOS {
    void main() {
        int dividendo = Integer.parseInt(IO.readln("Ingrese dividendo: "));

        int divisor = Integer.parseInt(IO.readln("Ingrese divisor: "));

        if (divisor == 0) {
            IO.println("El divisor es 0, se dividirá entre 1 para no causar errores");
            divisor = 1; //para que solo haga un ciclo y sea como dividir entre 1
        }

        // ^ esto es el XOR (EXCLUSIVE OR) me pasaba que cuando los dos eran negativos se activaba con un simple || y mas shenanigans mios de Math.abs para el cociente
        int signo = ((dividendo < 0) ^ (divisor < 0)) ? -1 : 1;

        int absolutoDividendo = Math.abs(dividendo);
        int absolutoDivisor = Math.abs(divisor);

        int cociente = 0;
        while (absolutoDividendo >= absolutoDivisor) {
            absolutoDividendo -= absolutoDivisor;
            cociente++;
        }
        int cocienteresultado = cociente * signo;

        int resto = dividendo - (divisor * cocienteresultado);

        IO.println("El cociente es: " + cocienteresultado);
        IO.println("El resto es: " + resto);
    }
}