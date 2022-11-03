package crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
	Connection con;
	public Conexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			System.out.println("Conexion establecida");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error" + e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion cn= new Conexion();
		Statement st;
		ResultSet rs;
		try {
			st=cn.con.createStatement();
			rs=st.executeQuery("select * from emple");
			while (rs.next()) {
				System.out.println(rs.getString("apellido"));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
