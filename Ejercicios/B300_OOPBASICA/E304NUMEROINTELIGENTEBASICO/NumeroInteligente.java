package B300_OOPBASICA.E304NUMEROINTELIGENTEBASICO;

public class NumeroInteligente {
    private int valor;

    public NumeroInteligente() {
        this.valor = 1;
    }

    public NumeroInteligente(int n) {
        this.valor = n;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int n) {
        this.valor = n;
    }

    void incrementar() {
        this.valor = this.valor + 1;
    }

    void incrementar(int n) {
        this.valor = this.valor + n;
    }

    void decrementar() {
        this.valor = this.valor - 1;
    }

    void decrementar(int n) {
        this.valor = this.valor - n;
    }

    boolean esPrimo() {
        //numero menor de dos no son primos
        if (this.valor < 2) {
            return false;
        }

        //2 y 3 son primos
        if (this.valor == 2 || this.valor == 3) {
            return true;
        }

        //si es par excepto dos no es primo
        if (this.valor % 2 == 0) {
            return false;
        }

        //usamos el typecast (int) para omitir los decimales de la raiz cuadrada y asi tener menos lio
        for (int i = 3; i <= (int) Math.sqrt(this.valor); i += 2) {  //saltarse los pares sumando dos
            if (esDivisible(this.valor, i)) {
                return false;  //si se encuentra un divisor no es primo, es falso
            }
        }

        return true;
    }
    
    public boolean esPerfecto() {
        //sacar suma de divisores
        int sumaDivisores = 1;
        for (int i = 2; i < this.valor; i++) {
            if (esDivisible(this.valor, i)) {
                if (i != this.valor) {
                    sumaDivisores = sumaDivisores + i;
                }
            }
        }

        //comprobar y devolver si es perfecto
        return sumaDivisores == this.valor;
    }

    private boolean esDivisible(int dividendo, int divisor) {
        int resultadoDivisible = dividendo % divisor;
        //si es divisible devuelve true al ser un statement
        return resultadoDivisible == 0;
    }
}
