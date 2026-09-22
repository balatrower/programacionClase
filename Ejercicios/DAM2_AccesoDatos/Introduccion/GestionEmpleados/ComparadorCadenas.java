package DAM2_AccesoDatos.Introduccion.GestionEmpleados;

public class ComparadorCadenas {
    ComparadorCadenas() {
    }

    public boolean comparar(String DNI1, String DNI2) {
        int DNI1Numeros = Integer.parseInt(DNI1.substring(0, 8));
        int DNI2Numeros = Integer.parseInt(DNI2.substring(0, 8));
        if (DNI1Numeros > DNI2Numeros) {
            return true;
        } else if (DNI1Numeros < DNI2Numeros) {
            return false;
        } else {
            char letra1 = DNI1.charAt(8);
            char letra2 = DNI2.charAt(8);
            return letra1 < letra2;
        }
    }
}
