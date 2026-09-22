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

        this.dni = dni;
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

    boolean compareTo(Empleado empleado) {
        ComparadorCadenas comparador = new ComparadorCadenas();
        return  comparador.comparar(getDni(), empleado.getDni());
    }
}
