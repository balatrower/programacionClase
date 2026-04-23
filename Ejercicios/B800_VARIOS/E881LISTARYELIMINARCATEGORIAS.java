package B800_VARIOS;

import java.sql.*;

public class E881LISTARYELIMINARCATEGORIAS {
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String BD = "agenda";
    private static final String USUARIO = "root";
    private static final String CONTRASENNA = "";

    void main() throws SQLException {
        boolean dirverOperativo = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Todo bien.");
            dirverOperativo = true;
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha podido encontrar el driver...");
        }

        if (dirverOperativo) {
            Connection conn = (Connection) DriverManager.getConnection(URL + BD, USUARIO, CONTRASENNA);

            if (conn != null) {
                System.out.println("Conectado a la base de datos [" + BD + "]");
            }

            boolean salir = false;
            do {
                IO.print("OPCIONES DEL MENU (0: Salir, 1: Listar Categorias y 2:Eliminar Categoria por id)");
                int opcion = Integer.parseInt(IO.readln());

                if (opcion == 0) {
                    salir = true;
                    continue;
                }

                ejecutarOpcion(opcion, conn);
            } while (salir);
        }
    }

    void ejecutarOpcion(int opcion, Connection conn) throws SQLException {
        int categoria = 0;
        if (opcion == 2) {
            categoria = Integer.parseInt(IO.readln("Introduzca el id de la categoria a eliminar: "));
        }

        switch (opcion) {
            case 1 -> listarCategorias(conn);
            case 2 -> eliminarCategoria(categoria, conn);
        }
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

    void eliminarCategoria(int idCategoria, Connection conn) throws SQLException {
        String sql = "DELETE FROM Categoria WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, idCategoria);

        try {
            ps.executeUpdate();
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }
}
