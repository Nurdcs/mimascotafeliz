package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class LoginDAO {
	PreparedStatement ps=null;
	ResultSet res=null;
	Conexion con= new Conexion();
	Connection conecta=con.Conecta();

	
	
	
	 public Usuarios_DTO login(Usuarios_DTO us){
	  
		    Usuarios_DTO u=null;
		    
		    try{
		    String sql="select * from usuarios where usuario=? and password_usuario=?";
		    
		    ps =conecta.prepareStatement(sql);
		    ps.setString(1, us.getUsuario());
			ps.setString(2, us.getPassword());
			res=ps.executeQuery();
		    
		    if(res.next()){

		       u= new Usuarios_DTO(res.getLong(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));

		     }
		    }catch(SQLException ex){
		     JOptionPane.showMessageDialog(null,"Error al Consultar" +ex);
		    }
		    return u;
		    }
}
