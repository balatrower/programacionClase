package B800_VARIOS.E883CRUDAGENDACOMPLETOCONCONEXIONBD;

import java.sql.*;

public class Principal {
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String BD = "agenda";
    private static final String USUARIO = "root";
    private static final String CONTRASENNA = "";

    public static void main(String[] args) throws SQLException {
        ConexionBD conexionBD = new ConexionBD();

        conexionBD.conectar(URL, BD, USUARIO, CONTRASENNA);

        boolean salir = false;
        do {
            IO.print("OPCIONES DEL MENU: \n0: Salir, 1: Listar Categorias, 2:Insertar una nueva categoria," +
                    " 3:Eliminar Categoria, 4:Modificar nombre de una categoria, 5:Obtener categoria por Id." +
                    "6:Listar personas, 7:Obtener una  por id, 8:Insertar una persona, 9:Eliminar una persona, 10:Modificar una persona.");
            int opcion = Integer.parseInt(IO.readln());

            if (opcion == 0) {
                salir = true;
                continue;
            }

            switch (opcion) {
                case 1 -> listarCategorias(conexionBD);
                case 2 -> insertarCategoria(conexionBD);
                case 3 -> eliminarCategoria(conexionBD);
                case 4 -> modificarNombreCategoria(conexionBD);
                case 5 -> obetenerCategoriaPorId(conexionBD);
                case 6 -> listarPersonas(conexionBD);
                case 7 -> obtenerPersonaPorId(conexionBD);
                case 8 -> insertarPersona(conexionBD);
                case 9 -> eliminarPersona(conexionBD);
                case 10 -> modificarPersona(conexionBD);
            }
        } while (!salir);
    }

    private static void modificarPersona(ConexionBD conexionBD) throws SQLException {
        System.out.println("Introduce un id de persona para ser actualizado: ");
        int idPersona = pedirNumeroUsuarioSanitizado();
        System.out.println("Introduce una edad nueva: ");
        int edadNueva = pedirNumeroUsuarioSanitizado();

        String sql = "UPDATE Persona SET edad = ? WHERE id = ?";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ps.setInt(1, edadNueva);
        ps.setInt(2, idPersona);

        try {
            conexionBD.ejecutarActualizacion(ps);
            System.out.println("Actualizacion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    private static void eliminarPersona(ConexionBD conexionBD) throws SQLException {
        System.out.println("Introduce un id de persona para ser eliminada: ");
        int idPersona = pedirNumeroUsuarioSanitizado();

        String sql = "DELETE FROM Persona WHERE id = ?";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ps.setInt(1, idPersona);

        try {
            conexionBD.ejecutarActualizacion(ps);
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    private static void insertarPersona(ConexionBD conexionBD) throws SQLException {
        String nombre = IO.readln("Introduce un nombre para la persona a insertar: ");
        String apellido = IO.readln("Introduce un apellido para la persona a insertar: ");
        System.out.println("Introduce un numero de telefono para la persona a insertar: ");
        int telefono = pedirNumeroUsuarioSanitizado();
        System.out.println("Introduce una edad para la persona a insertar: ");
        int edad = pedirNumeroUsuarioSanitizado();
        System.out.println("Introduce un numero de estrella para la persona a insertar: ");
        int estrella = pedirNumeroUsuarioSanitizado();
        System.out.println("Introduce un id de categoria para la persona a insertar: ");
        int idCategoria = pedirNumeroUsuarioSanitizado();

        String sql = "INSERT INTO Categoria(nombre) VALUES (?)";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ps.setString(1, nombre);
        ps.setString(2, apellido);
        ps.setInt(3, telefono);
        ps.setInt(4, edad);
        ps.setInt(5, estrella);
        ps.setInt(6, idCategoria);

        try {
            conexionBD.ejecutarActualizacion(ps);
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    private static void obtenerPersonaPorId(ConexionBD conexionBD) throws SQLException {
        System.out.println("Escribe el id de la persona a obtener: ");
        int idPersona = pedirNumeroUsuarioSanitizado();

        String sql = "SELECT * FROM Persona WHERE id + ?";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ps.setInt(1, idPersona);

        ResultSet rs = conexionBD.ejecutarConsulta(ps);

        System.out.println("Tabla: categoria");
        while (rs.next()) {
            System.out.printf("id: %d, nombre: %s \n", rs.getInt("id"), rs.getString("nombre"));
        }
        System.out.println();

        ps.close();
        rs.close();
    }

    private static void listarPersonas(ConexionBD conexionBD) throws SQLException {
        String sql = "SELECT * FROM Persona";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ResultSet rs = conexionBD.ejecutarConsulta(ps);

        System.out.println("Tabla: categoria");
        while (rs.next()) {
            System.out.printf("id: %d, nombre: %s \n", rs.getInt("id"), rs.getString("nombre"));
        }
        System.out.println();

        ps.close();
        rs.close();
    }

    private static void obetenerCategoriaPorId(ConexionBD conexionBD) throws SQLException {
        System.out.println("Escribe el id de la categoria a obtener: ");
        int idCategoria = pedirNumeroUsuarioSanitizado();

        String sql = "SELECT * FROM Categoria WHERE id + ?";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ps.setInt(1, idCategoria);

        ResultSet rs = conexionBD.ejecutarConsulta(ps);

        System.out.println("Tabla: categoria");
        while (rs.next()) {
            System.out.printf("id: %d, nombre: %s \n", rs.getInt("id"), rs.getString("nombre"));
        }
        System.out.println();

        ps.close();
        rs.close();
    }

    private static void modificarNombreCategoria(ConexionBD conexionBD) throws SQLException {
        System.out.println("Escribe el id de la categoria a la que cambiar el nombre: ");
        int idCategoria = pedirNumeroUsuarioSanitizado();
        String nombreNuevo = IO.readln("Introduce un nombre para la categoria a renombrar: ");

        String sql = "UPDATE Categoria SET nombre = ? WHERE id = ?";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ps.setString(1, nombreNuevo);
        ps.setInt(2, idCategoria);

        try {
            conexionBD.ejecutarActualizacion(ps);
            System.out.println("Actualizacion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    private static void insertarCategoria(ConexionBD conexionBD) throws SQLException {
        String nombreNuevo = IO.readln("Introduce un nombre para la categoria a insertar: ");

        String sql = "INSERT INTO Categoria(nombre) VALUES (?)";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ps.setString(1, nombreNuevo);

        try {
            conexionBD.ejecutarActualizacion(ps);
            System.out.println("Insercion ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo insertar en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    static void listarCategorias(ConexionBD conexionBD) throws SQLException {
        String sql = "SELECT * FROM categoria";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ResultSet rs = conexionBD.ejecutarConsulta(ps);

        System.out.println("Tabla: categoria");
        while (rs.next()) {
            System.out.printf("id: %d, nombre: %s \n", rs.getInt("id"), rs.getString("nombre"));
        }
        System.out.println();

        ps.close();
        rs.close();
    }

    static void eliminarCategoria(ConexionBD conexionBD) throws SQLException {
        System.out.println("Introduce id de categoria para eliminar: ");
        int idCategoria = pedirNumeroUsuarioSanitizado();

        String sql = "DELETE FROM Categoria WHERE id = ?";
        PreparedStatement ps = conexionBD.prepareStatement(sql);

        ps.setInt(1, idCategoria);

        try {
            conexionBD.ejecutarActualizacion(ps);
            System.out.println("Orden ejecutada con exito");
        } catch (SQLException enrique) {
            System.out.println("No se pudo realizar la orden en la base de datos");
            enrique.printStackTrace();
        }

        ps.close();
    }

    static int pedirNumeroUsuarioSanitizado() {
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
