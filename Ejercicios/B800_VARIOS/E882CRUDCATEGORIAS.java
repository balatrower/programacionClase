package B800_VARIOS;

import java.sql.*;

public class E882CRUDCATEGORIAS {
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String BD = "agenda";
    private static final String USUARIO = "root";
    private static final String CONTRASENNA = "";

    void main() throws SQLException {
        if (isDirverOperativo()) {
            Connection conn = DriverManager.getConnection(URL + BD, USUARIO, CONTRASENNA);

            if (conn != null) {
                System.out.println("Conectado a la base de datos [" + BD + "]");
            }

            boolean salir = false;
            do {
                IO.print("OPCIONES DEL MENU (0: Salir, 1: Listar Categorias, 2:Insertar una nueva categoria," +
                        " 3:Eliminar Categoria y 4:Modificar nombre de una categoria)");
                int opcion = Integer.parseInt(IO.readln());

                if (opcion == 0) {
                    salir = true;
                    continue;
                }

                ejecutarOpcion(opcion, conn);
            } while (!salir);
        }
    }

    private static boolean isDirverOperativo() {
        boolean dirverOperativo = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Todo bien.");
            dirverOperativo = true;
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha podido encontrar el driver...");
        }
        return dirverOperativo;
    }

    void ejecutarOpcion(int opcion, Connection conn) throws SQLException {
        switch (opcion) {
            case 1 -> listarCategorias(conn);
            case 2 -> insertarCategoria(conn);
            case 3 -> eliminarCategoria(conn);
            case 4 -> modificarNombreCategoria(conn);
        }
    }

    private void modificarNombreCategoria(Connection conn) throws SQLException {
        System.out.println("Escribe el id de la categoria a la que cambiar el nombre: ");
        int idCategoria = pedirNumeroUsuarioSanitizado();
        String nombreNuevo = IO.readln("Introduce un nombre para la categoria a renombrar: ");

        String sql = "UPDATE Categoria SET nombre = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, nombreNuevo);
        ps.setInt(2, idCategoria);

        try {
            ps.executeUpdate();
            System.out.println("Actualizacion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    private void insertarCategoria(Connection conn) throws SQLException {
        String nombreNuevo = IO.readln("Introduce un nombre para la categoria a insertar: ");

        String sql = "INSERT INTO Categoria(nombre) VALUES (?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, nombreNuevo);

        try {
            ps.executeUpdate();
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    void listarCategorias(Connection conn) throws SQLException {
        String sql = "SELECT * FROM categoria";
        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        System.out.println("Tabla: categoria");
        while (rs.next()) {
            System.out.printf("id: %d, nombre: %s \n", rs.getInt("id"), rs.getString("nombre"));
        }
        System.out.println();

        ps.close();
        rs.close();
    }

    void eliminarCategoria(Connection conn) throws SQLException {
        System.out.println("Introduce id de categoria para eliminar: ");
        int idCategoria = pedirNumeroUsuarioSanitizado();

        String sql = "DELETE FROM Categoria WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, idCategoria);

        try {
            ps.executeUpdate();
            System.out.println("Orden ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo realizar la orden en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    int pedirNumeroUsuarioSanitizado() {
        int numero = -1;
        do {
            try {
                numero = Integer.parseInt(IO.readln());
            } catch (NumberFormatException enrique) {
                System.out.println("Numero no valido, vuelva a intentarlo");
            }
        }while (numero < 0);
        return numero;
    }
}
