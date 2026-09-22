package DAM2_AccesoDatos.Introduccion.GestionEmpleados;

public class Empleado {
    String dni = "";
    String nombre = "";
    String apellidos = "";
    float telefono = 0;
    double salario = 0;

    Empleado(String dni, String nombre, String apellidos, float telefono, double salario) {
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);
        setTelefono(telefono);
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTelefono() {
        return telefono;
    }

    public void setTelefono(float telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        dni = dni.toUpperCase();
        int numeros = 0;
        try {
            numeros = Integer.parseInt(dni.substring(0, 8));
        } catch (Exception enrique) {
            IO.println("Error: Fallo al leer dni del empleado");
        }

        if (numeros == 0) {
            IO.println("Introduzca de nuevo SOLO los numeros del dni del empleado que intenta añadir: ");
            do {
                try {
                    numeros = Integer.parseInt(IO.readln());
                } catch (Exception enrique2) {
                    IO.println("Error: numeros no validos, introduzcalos de nuevo");
                }
            } while (numeros == 0);
        }


        char letra = dni.charAt(8);
        if (letra >= 'A' && letra <= 'Z') {
            this.dni = Integer.toString(numeros) + letra; // dni en rango
        } else {
            do {
                IO.println("Introduzca la letra del DNI del empleado");
                letra = IO.readln().charAt(0);
            } while (letra < 'A' || letra > 'Z');

            this.dni = Integer.toString(numeros) + letra;
        }

    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String telefono = Float.toString(getTelefono());
        String telefonoFormateado = telefono.substring(0,3) + "-" + telefono.substring(3, telefono.length() - 2);
        return String.format("Empleado: [DNI=%s, Nombre=%s, Apellido=%s, Teléfono=%s, Salario=%.1f]",
                getDni(),getNombre(), getApellidos(), telefonoFormateado, getSalario());
    }

    public boolean compareTo(Empleado empleado) {
        ComparadorCadenas comparador = new ComparadorCadenas();
        return comparador.comparar(getDni(), empleado.getDni());
    }
}
