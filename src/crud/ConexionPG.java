package crud;

import java.sql.*;

public class ConexionPG {
	Connection con;

	public ConexionPG() {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Emple", "postgres", "12345");
			System.out.println("Conexion establecida");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" + e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionPG cn = new ConexionPG();
		Statement st;
		ResultSet rs;
		try {
			st = cn.con.createStatement();
			rs = st.executeQuery("select * from emple");
			while (rs.next()) {
				System.out.println(rs.getString("nombre"));

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
