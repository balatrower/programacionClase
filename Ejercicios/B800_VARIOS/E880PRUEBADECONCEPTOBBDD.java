package B800_VARIOS;


import java.sql.*;

public class E880PRUEBADECONCEPTOBBDD {
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

            obtenerCategorias(conn);
            obtenerPersonas(conn);
            insertarCategoria(conn);
            insterarPersona(conn);
            eliminarCategoria(conn);
            eliminarPersona(conn);
            modificarNombreCategoria(conn);
            modificarEdadPersona(conn);
            sumarUnAnyoEdadPersona(conn);
        }
    }

    void obtenerCategorias(Connection conn) throws SQLException {
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

    void obtenerPersonas(Connection conn) throws SQLException {
        String sql = "SELECT * FROM persona";
        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        System.out.println("Tabla: persona");
        while (rs.next()) {
            System.out.printf("id: %d, nombre: %s, apellidos: %s, telefono: %d, edad: %d, estrella: %d, categoriaId: %d \n",
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellidos"),
                    rs.getInt("telefono"),
                    rs.getInt("edad"),
                    rs.getInt("estrella"),
                    rs.getInt("categoriaId")
            );
        }
        System.out.println();

        ps.close();
        rs.close();
    }

    void insertarCategoria(Connection conn) throws SQLException {
        String sql = "INSERT INTO Categoria(id, nombre) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, 6);
        ps.setString(2, "Conocidos");

        try {
            ps.executeUpdate();
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    void insterarPersona(Connection conn) throws SQLException {
        String sql = "INSERT INTO Persona(id, nombre, apellidos, telefono, edad, estrella, categoriaId) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, 7);
        ps.setString(2, "Alberto");
        ps.setString(3, "Ruiz");
        ps.setInt(4, 655674588);
        ps.setInt(5, 45);
        ps.setInt(6, 1);
        ps.setInt(7, 3);

        try {
            ps.executeUpdate();
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    void eliminarCategoria(Connection conn) throws SQLException {
        String sql = "DELETE FROM Categoria WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, 6);

        try {
            ps.executeUpdate();
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    void eliminarPersona(Connection conn) throws SQLException {
        String sql = "DELETE FROM Persona WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, 7);

        try {
            ps.executeUpdate();
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    void modificarNombreCategoria(Connection conn) throws SQLException {
        String sql = "UPDATE Categoria SET nombre = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, "Amigos de confianza");
        ps.setInt(2, 8);

        try {
            ps.executeUpdate();
            System.out.println("Actualizacion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    void modificarEdadPersona(Connection conn) throws SQLException {
        String sql = "UPDATE Persona SET edad = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, 14);
        ps.setInt(2, 13);

        try {
            ps.executeUpdate();
            System.out.println("Actualizacion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    void sumarUnAnyoEdadPersona(Connection conn) throws SQLException {
        String sql = "UPDATE Persona SET edad = edad + 1 WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, 13);

        try {
            ps.executeUpdate();
            System.out.println("Actualizacion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }
}
