package B800_VARIOS.E883CRUDAGENDACOMPLETOCONCONEXIONBD;

import java.sql.*;

public class ConexionBD {
	private Connection conexion;

	public void conectar(String url, String bd, String usuario, String contrasenna) throws SQLException {
        this.conexion = DriverManager.getConnection(url + bd, usuario, contrasenna);
	}

	public void desconectar() throws SQLException {
        this.conexion.close();
	}

	public PreparedStatement prepareStatement(String sql) throws SQLException {
		return conexion.prepareStatement(sql);
	}

	public ResultSet ejecutarConsulta(PreparedStatement preparedStatement) throws SQLException {
		return preparedStatement.executeQuery();
	}

	public void ejecutarActualizacion(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.executeUpdate();
	}
}
