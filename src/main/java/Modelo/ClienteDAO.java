package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controlador.Conexion;

public class ClienteDAO {
	PreparedStatement ps=null;
	ResultSet rs=null;
	Conexion con= new Conexion();
	Connection cnn=con.Conecta();
	ClienteDTO clidto;
	
	public boolean Inserta_Cliente(ClienteDTO u){

		boolean resultado=false;
		//ClienteDTO usu=null;
		try{
		//usu=  buscarcliente(u);
		//if(usu!=null) {
			JOptionPane.showMessageDialog(null, "El Usuario ya existe...");
		//}else {
	    ps =cnn.prepareStatement("Insert Into clientes value(?,?,?,?,?)");
		ps.setLong(1, u.getCedula());
		ps.setString(2, u.getDireccion());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getNombre());
		ps.setString(5, u.getTelefono());
		resultado=ps.executeUpdate()>0;
		//}
		}catch(SQLException ex){
		 JOptionPane.showMessageDialog(null, "Error al Insertar" +ex);
		}
		return resultado;
		} 
	
	  public ClienteDTO consultarcliente(ClienteDTO cli) {
		try {
			ps=cnn.prepareStatement("SELECT * FROM clientes WHERE cedula_cliente=?");
			ps.setLong(1, cli.getCedula());
			rs=ps.executeQuery();
			if(rs.next()){
			 clidto=new ClienteDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				  
		return clidto;  
	  }
	
	public boolean eliminar(ClienteDTO cli) {
		boolean res=false;
		try {
			ps=cnn.prepareStatement("DELETE FROM clientes WHERE cedula_cliente=?");
		     ps.setLong(1, cli.getCedula());
		     
		     res=ps.executeUpdate()>0;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
   
}
