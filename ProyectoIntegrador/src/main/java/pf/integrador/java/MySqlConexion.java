package pf.integrador.java;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class MySqlConexion {
	private static final String CONTROLADOR="com.mysql.cj.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/trabajo_integrador";
	private static final String USEER="root";
	private static final String PASS="";
static {
	try {
		Class.forName(CONTROLADOR);
		System.out.println("Se cargó el controlador correctamente");
	} catch (ClassNotFoundException e) {
		System.out.println("Error al cargar el controlador");
		e.printStackTrace();
	}
}
  public Connection conectar(){
	  Connection conexion=null;
	  try {
		  conexion=DriverManager.getConnection(URL, USEER, PASS);
		  System.out.println("Conexion con la BD exitosa");
		  
	  }catch(SQLException e) {
		  System.out.println("Error al cargar BD");
		  e.printStackTrace();
	  }
	  return conexion;
  }
 
}
