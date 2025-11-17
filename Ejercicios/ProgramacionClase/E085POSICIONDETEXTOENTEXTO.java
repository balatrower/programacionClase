void main() {
    String textoBuscado = "tam";
    String textoPrincipal = "metanfetamina";

    int resultado = buscarPosicionEnTexto(textoBuscado, textoPrincipal);
    IO.println(resultado);
}

int buscarPosicionEnTexto(String textoBuscado, String textoPrincipal) {
    switch (textoBuscado.length()) {
        case 1 -> {
            return buscarPosicionCaracterEnTexto(textoBuscado.charAt(0), textoPrincipal);
        }

        default -> {
            boolean noEncontrado = true;
            while (noEncontrado) {
                int posicionPrimerCaracter = buscarPosicionCaracterEnTexto(textoBuscado.charAt(0), textoPrincipal);

                //si el caracter se encuentra seguir
                if (posicionPrimerCaracter != -1) {
                    int contadorCaracteresSeguidos = 0;
                    for (int i = 1; i < textoBuscado.length(); i++) {
                        //sacar posicion del caracter siguiente desde la posicion del caracter anterior
                        int posicionCaracterSiguiente = buscarPosicionCaracterEnTextoConInicio(textoBuscado.charAt(i), textoPrincipal, posicionPrimerCaracter);

                        if (posicionPrimerCaracter + i == posicionCaracterSiguiente) {
                            contadorCaracteresSeguidos++;
                        }
                    }

                    if (contadorCaracteresSeguidos == textoBuscado.length()) {
                        noEncontrado = false;
                    }
                }
            }

            if (!(noEncontrado)) {
                return buscarPosicionCaracterEnTexto(textoBuscado.charAt(0), textoPrincipal);
            }
        }
    }
    return -1;
}

int buscarPosicionCaracterEnTexto(char caracter, String textoPrincipal) {
    int posicion = 0;
    for (int i = 0; i < textoPrincipal.length(); i++){
        if (caracter == textoPrincipal.charAt(i)) {
            posicion = i;
            break;
        }
    }
    return posicion;
}

int buscarPosicionCaracterEnTextoConInicio(char caracter, String textoPrincipal, int caracterInicio) {
    int posicion = 0;
    for (int i = caracterInicio; i < textoPrincipal.length(); i++){
        if (caracter == textoPrincipal.charAt(i)) {
            posicion = i;
            break;
        }
    }
    return posicion;
}