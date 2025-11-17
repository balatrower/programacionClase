package ProgramacionClase;

public class E085POSICIONDETEXTOENTEXTO {
    void main() {
        String textoBuscado = IO.readln("Introduce texto a buscar dentro del siguiente texto: \n").toLowerCase();

        String textoPrincipal = IO.readln("Introduce texto en el que se buscara el anterior texto: \n").toLowerCase();

        System.out.format("El texto `%s´ esta en la posicion %d dentro del texto %s.", textoBuscado, buscarPosicionEnTexto(textoBuscado, textoPrincipal), textoPrincipal);
    }

    int buscarPosicionEnTexto(String textoBuscado, String textoPrincipal) {
        switch (textoBuscado.length()) {
            case 1 -> {
                //inicio cero para que busque desde el principio
                return buscarPosicionCaracterEnTextoConInicio(textoBuscado.charAt(0), textoPrincipal, 0);
            }

            case 2 -> {
                int posicionPrimerCaracter = buscarPosicionCaracterEnTextoConInicio(textoBuscado.charAt(0), textoPrincipal, 0);

                //si existe un caracter en el texto como el dado seguir
                if (posicionPrimerCaracter != -1) {
                    int posicionSegundoCaracter = buscarPosicionCaracterEnTextoConInicio(textoBuscado.charAt(1), textoPrincipal, 0);

                    //si es el caracter siguiente del primero entonces devolver el primero porque solo es para textos de dos caracteres
                    if (posicionPrimerCaracter + 1 == posicionSegundoCaracter) {
                        return posicionPrimerCaracter;
                    }
                }
            }

            default -> {
                //bucle para ir chekeando caracter por caracter si hay alguno igual que el primer caracter del textoBuscado
                for (int j = 0; j < textoPrincipal.length(); j++) {
                    if (textoPrincipal.charAt(j) == ' ') {
                        continue;
                    }
                    //sacar posicion del primer caracter
                    int posicionPrimerCaracter = buscarPosicionCaracterEnTextoConInicio(textoBuscado.charAt(0), textoPrincipal, j);

                    //si el caracter se encuentra seguir
                    if (posicionPrimerCaracter != -1) {
                        //inicializar contador para saber la racha de caracteres seguidos
                        int contadorCaracteresSeguidos = 0;
                        for (int i = 1; i < textoBuscado.length(); i++) {
                            //sacar posicion del caracter siguiente desde la posicion del caracter anterior
                            int posicionCaracterSiguiente = buscarPosicionCaracterEnTextoConInicio(textoBuscado.charAt(i), textoPrincipal, posicionPrimerCaracter);

                            //si el caracter primero es seguido de los siguientes caracteres entonces sumar contador para saber cuantos hemos contado
                            if (posicionPrimerCaracter + i == posicionCaracterSiguiente) {
                                contadorCaracteresSeguidos++;
                            }
                        }
                        //si todos los caracteres han sido seguidos es decir el texto entero, entonces devolver pos primer caracter
                        if (contadorCaracteresSeguidos == textoBuscado.length() - 1) {
                            return posicionPrimerCaracter;
                        }
                    }
                }
            }
        }
        return -1;
    }

    int buscarPosicionCaracterEnTextoConInicio(char caracter, String textoPrincipal, int caracterInicio) {
        int posicion = 0;
        for (int i = caracterInicio; i < textoPrincipal.length(); i++) {
            if (caracter == textoPrincipal.charAt(i)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
}