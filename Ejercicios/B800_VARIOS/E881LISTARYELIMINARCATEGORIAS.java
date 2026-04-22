package B800_VARIOS;

public class E881LISTARYELIMINARCATEGORIAS {
    void main() {
        boolean salir = false;
        do {
            IO.print("OPCIONES DEL MENU (0: Salir, 1: Listar Categorias y 2:Eliminar Categoria por id)");
            int opcion = Integer.parseInt(IO.readln());

            if (opcion == 0) {
                salir = true;
                continue;
            }

            ejecutarOpcion(opcion);
        } while (salir);
    }

    void ejecutarOpcion(int opcion) {
        int categoria = 0;
        if (opcion == 2) {
            categoria = Integer.parseInt(IO.readln("Introduzca el id de la categoria a eliminar: "));
        }

        switch (opcion) {
            case 1 -> listarCategorias();
            case 2 -> eliminarCategoria(categoria);
        }
    }

    void listarCategorias() {

    }

    void eliminarCategoria(int idCategoria) {

    }
}
