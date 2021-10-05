package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
	
	    public String db="TiendaGenerica";
	    public String url="jdbc:mysql://localhost/"+db;
	    public String user="root";
	    public String pass="";
	    Connection conec=null;


	public Connection Conecta() // Retorna la conexion
	{

	    try 
	    {
	     Class.forName("com.mysql.cj.jdbc.Driver");
	     conec= DriverManager.getConnection(this.url,this.user,this.pass);
	     //JOptionPane.showMessageDialog(null,"Conexion Ok........\n");
	    }
	    catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "Error al Conectar........\n"+e);
	    }
	 return conec;
	}
	}



