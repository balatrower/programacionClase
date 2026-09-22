package DAM2_AccesoDatos.Introduccion.GestionEmpleados;

import java.util.ArrayList;
import java.util.Comparator;

public class GestionEmpleados {
    ArrayList<Empleado> listaEmpleados;

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    GestionEmpleados() {
        this.listaEmpleados = new ArrayList<>();
    }

    public void anyadirEmpleado(Empleado empelado) {
        getListaEmpleados().add(empelado);
    }

    public void ordenarPorDNI() {
        for (int i = 1; i < getListaEmpleados().size() - 1; i++) {
            for (int j = 0; j < getListaEmpleados().size() - i; j++) {
                Empleado empleado1 = getListaEmpleados().get(j);
                Empleado empleado2 = getListaEmpleados().get(j + 1);
                if (empleado1.compareTo(empleado2)) {
                    getListaEmpleados().set(j, empleado2);
                    getListaEmpleados().set(j + 1, empleado1);
                }
            }
        }
    }

    public void ordenarPorNombre() {
        listaEmpleados.sort(Comparator.comparing(Empleado::getNombre, String.CASE_INSENSITIVE_ORDER));
    }

    public void ordenarPorApellidos() {
        listaEmpleados.sort(Comparator.comparing(Empleado::getApellidos, String.CASE_INSENSITIVE_ORDER));
    }

    public void ordenarPorSalario() {
        listaEmpleados.sort(Comparator.comparingDouble(Empleado::getSalario));
    }

    public void ordenarPorTelefono() {
        listaEmpleados.sort(Comparator.comparing(Empleado::getTelefono));
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : getListaEmpleados()) {
            IO.println(empleado.toString());
        }
    }
}
