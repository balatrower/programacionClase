package ProgramacionClase;

public class E081TIPODECARACTER {
    void main() {
        char caracterDado = IO.readln("Escribe un carácter para decirle de que tipo es: ").charAt(0);
        IO.println("El carácter " + caracterDado + " es del tipo: " + identificarTipoCaracter(caracterDado));
    }

    String identificarTipoCaracter(char caracter) {
        switch (caracter) {
            case ',', '.', '-', '(', ')', '!', '¡', '?', '¿' -> {
                return "símbolo";
            }

            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                return "dígito";
            }

            case 'ñ' -> {
                return "letra minúscula";
            }

            case 'Ñ' -> {
                return "letra mayúscula";
            }
        }

        if (caracter >= 'a' && caracter <= 'z') {
            return "letra minúscula";
        }

        if (caracter >= 'A' && caracter <= 'Z') {
            return "letra mayúscula";
        }

        return "símbolo";
    }
}