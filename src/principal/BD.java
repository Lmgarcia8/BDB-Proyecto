package principal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Medicamento;

// import com.sun.corba.se.spi.orbutil.fsm.State;


public class BD {

    private final String CONNECTION_URL = "jdbc:mysql://localhost:3306/mydb";
    private final String CONNECTION_Usuario = "root";
    private final String CONNECTION_PASSWD = "laura04051998";
    private static Connection con;

    public BD() {
        try {
            con = DriverManager.getConnection(CONNECTION_URL, CONNECTION_Usuario, CONNECTION_PASSWD);
        } catch (SQLException e) {
            System.err.println("ERROR. Trying to create database connection" + e.getMessage());
        }
    }

public Medicamento getMedicamento(String nombre) {
	try
	{
		Medicamento p = null;
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("SELECT id FROM Medicamento WHERE Nombre='"+nombre+"';");
		if(result.next()) {
			p = new Medicamento(
					result.getString("id"),
					result.getString("Nombre"),
					result.getString("TipoConsumir"),
					result.getString("Dosis"),
					result.getDouble("PrecioAproximado"),
					result.getBoolean("Autorizado"),
					result.getString("PrincipioActivo_id")
			);
		}
		result.close();
		stmt.close();
		return p;
	}
	catch (SQLException ex)
	{
		throw new Error("ERROR. Trying to getMedicamento -> " + ex.getMessage());
	}
}
public Medicamento getMedicamentoPrecioAproximado(Double PrecioMax, Double PrecioMin) {
	try
	{
		Medicamento p = null;
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("SELECT Nombre FROM Medicamento WHERE PrecioAproximado<PrecioMax AND PrecioAproximado>PrecioMin");
		if(result.next()) {
			p = new Medicamento(
					result.getString("id"),
					result.getString("Nombre"),
					result.getString("TipoConsumir"),
					result.getString("Dosis"),
					result.getDouble("PrecioAproximado"),
					result.getBoolean("Autorizado"),
					result.getString("PrincipioActivo_id")
			);
		}
		result.close();
		stmt.close();
		return p;
	}
	catch (SQLException ex)
	{
		throw new Error("ERROR. Trying to getMedicamentoPrecioAproximado -> " + ex.getMessage());
	}
}
}