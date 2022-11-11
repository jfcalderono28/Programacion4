package crud;

//java mysql
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;

public class Conexion {

	Connection con = null;

	public Conexion() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
			System.out.println("Conexion establecida");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" + e);
		}
	}

	// Traer datos Insert
	public int crear(String nombre) {
		String sql = "INSERT INTO "
				+ "`empleados`(`nombre`, `cedula`, `telefono`, `horasTrabajadas`, `valorHora`, `total`)" + " VALUES"
				+ " (" + nombre + ",'[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')";
		try {
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.execute();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error" + e);
			return 0;
		}
	}

	public ResultSet consultar(String consulta) {

		try {
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(consulta);
			ResultSet res = pstm.executeQuery();
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
			return null;
		}
	}

	// Crear datos CREATE

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Conexion con = new Conexion();

		ResultSet x = con.consultar("Select * from emple");
		while (x.next()) {
			System.out.println(x.getString("apellido"));

		}

	}

}
