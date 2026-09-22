package DAM2_AccesoDatos.Introduccion.GestionEmpleados;

public class Main {
    void main() {
        Empleado empleado1 = new Empleado("12345678A", "Gaster", "Doctor", 5551234, 1800.0);
        Empleado empleado2 = new Empleado("12345678B", "Gameraxe", "ROG", 5555678, 2800.0);
        Empleado empleado3 = new Empleado("12345679A", "Mancos", "Puerto", 5558765, 2000.0);
        GestionEmpleados gestor = new GestionEmpleados();

        gestor.anyadirEmpleado(empleado3);
        gestor.anyadirEmpleado(empleado1);
        gestor.anyadirEmpleado(empleado2);

        IO.println("Empleados antes de ordenar:");
        gestor.mostrarEmpleados();
        IO.println();

        boolean salir = false;
        while (!salir) {
            IO.println("--- MENÚ DE ORDENACIÓN ---");
            IO.println("1. Ordenar por DNI");
            IO.println("2. Ordenar por Nombre");
            IO.println("3. Ordenar por Apellidos");
            IO.println("4. Ordenar por Salario");
            IO.println("5. Ordenar por Teléfono");
            IO.println("0. Salir");
            IO.println("Elija una opción:");

            String opcion = IO.readln();

            switch (opcion) {
                case "1" -> {
                    gestor.ordenarPorDNI();
                    IO.println("Empleados ordenados por DNI:");
                    gestor.mostrarEmpleados();
                    IO.println();
                }
                case "2" -> {
                    gestor.ordenarPorNombre();
                    IO.println("Empleados ordenados por Nombre:");
                    gestor.mostrarEmpleados();
                    IO.println();
                }
                case "3" -> {
                    gestor.ordenarPorApellidos();
                    IO.println("Empleados ordenados por Apellido:");
                    gestor.mostrarEmpleados();
                    IO.println();
                }
                case "4" -> {
                    gestor.ordenarPorSalario();
                    IO.println("Empleados ordenados por Salario:");
                    gestor.mostrarEmpleados();
                    IO.println();
                }
                case "5" -> {
                    gestor.ordenarPorTelefono();
                    IO.println("Empleados ordenados por Teléfono:");
                    gestor.mostrarEmpleados();
                    IO.println();
                }
                case "6" -> {
                    IO.println("Saliendo del programa...");
                    salir = true;
                }
                default -> IO.println("Opción no válida.\n");
            }
        }
    }
}
