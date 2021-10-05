package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controlador.Conexion;

public class ProductosDAO {
	PreparedStatement ps=null;
	ResultSet rs=null;
	Conexion con= new Conexion();
	Connection cnn=con.Conecta();
	PoductosDTO prodto;
	
	
	
	
	
	 public PoductosDTO consultarproducto(PoductosDTO pro) {
			try {
				ps=cnn.prepareStatement("SELECT * FROM productos WHERE codigo_producto=?");
				ps.setLong(1, pro.getCodigoproducto());
				rs=ps.executeQuery();
				if(rs.next()){
				 prodto=new PoductosDTO(rs.getLong(1), rs.getDouble(2), rs.getLong(3), rs.getString(4), rs.getDouble(5),rs.getDouble(6));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
					  
			return prodto;  
		  }
}
