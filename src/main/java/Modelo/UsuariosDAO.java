package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import Controlador.Conexion;


public class UsuariosDAO {
	
	
	PreparedStatement ps=null;
	ResultSet res=null;
	Conexion con= new Conexion();
	Connection conecta=con.Conecta();

	
	public boolean Inserta_Usuario(Usuarios_DTO u){

		boolean resultado=false;
		Usuarios_DTO usu=null;
		try{
		usu= Buscar_Usuario(u.getCedula_Usuario());
		if(usu!=null) {
			JOptionPane.showMessageDialog(null, "El Usuario ya existe...");
		}else {
		String sql="Insert Into usuarios value(?,?,?,?,?)";
		ps =conecta.prepareStatement(sql);
		ps.setLong(1, u.getCedula_Usuario());
		ps.setString(2, u.getEmail_Usuario());
		ps.setString(3, u.getNombre_Usuario());
		ps.setString(5, u.getUsuario());
		ps.setString(4, u.getPassword());
		resultado=ps.executeUpdate()>0;
		}
		}catch(SQLException ex){
		 JOptionPane.showMessageDialog(null, "Error al Insertar" +ex);
		}
		return resultado;
		}  
	
    public Usuarios_DTO Buscar_Usuario(long cedula){

    Usuarios_DTO u=null;
    
    try{
    String sql="select * from usuarios where cedula_usuario=?";
    ps =conecta.prepareStatement(sql);
    ps.setLong(1, cedula);
    res=ps.executeQuery();
    
    while(res.next()){

       u= new Usuarios_DTO(res.getLong(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));

     }
    }catch(SQLException ex){
     JOptionPane.showMessageDialog(null,"Error al Consultar" +ex);
    }
    return u;
    }
	
    public boolean eliminarusuario(Usuarios_DTO us) {
		int x;
		boolean dat=false;
		try {
			ps=conecta.prepareStatement("DELETE FROM usuario WHERE documento=?");
			ps.setLong(1,us.getCedula_Usuario() );
			x=ps.executeUpdate();
			
			if(x>0) {
			dat=true;	
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return dat;
	}
    
    public int actulizar(Usuarios_DTO usdto) {
		int x=0;
	  try {
		ps=conecta.prepareStatement("UPDATE usuario Set nomusu=?,clave=?,rol=?,estado=? WHERE documento=?");
		ps.setString(1, usdto.getNombre_Usuario());
		ps.setString(2,usdto.getEmail_Usuario());
		ps.setString(3, usdto.getPassword());
		ps.setString(4, usdto.getUsuario());
		ps.setLong(5, usdto.getCedula_Usuario());
		x= ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  return x;
	}
    
    
    
}
