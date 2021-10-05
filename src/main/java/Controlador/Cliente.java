package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.ClienteDAO;
import Modelo.ClienteDTO;
import Modelo.Usuarios_DTO;

/**
 * Servlet implementation class Cliente
 */
@WebServlet("/Cliente")
public class Cliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nombre,correo,dir,tel;
		 long cedula;
		 ClienteDTO clidto;
		 ClienteDAO clidao;
		if(request.getParameter("btnisn")!=null) {
			 
			
			 cedula= Long.parseLong(request.getParameter("ced"));
			 dir = request.getParameter("dir");
			 correo = request.getParameter("ema");
			 nombre = request.getParameter("nom");
			 tel = request.getParameter("tel");
			  clidto= new ClienteDTO(cedula,dir,correo,nombre,tel);
			 clidao=new ClienteDAO();
			  
			 if(clidao.Inserta_Cliente(clidto)){
				 JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente");
				 response.sendRedirect("Usuarios.jsp");
			 }else {
				 JOptionPane.showMessageDialog(null, "Usuario No se registro");
				 response.sendRedirect("Usuarios.jsp");
			 }
			}
		
		if(request.getParameter("btncon")!=null) {
			
		
		  long ced;
		  ClienteDTO capdatos;
		  cedula=Long.parseLong(request.getParameter("ced"));
		  clidto=new ClienteDTO(cedula);
		  clidao=new ClienteDAO();
		  capdatos=clidao.consultarcliente(clidto);
		  ced=capdatos.getCedula();
		  nombre=capdatos.getNombre();
		  correo=capdatos.getEmail();
		  dir=capdatos.getDireccion();
		  tel=capdatos.getTelefono();
		  response.sendRedirect("clientes.jsp?c="+ced+"&n="+nombre+"&co="+correo+"&d="+dir+"&t="+tel);
		   
		  
			
		}
		
		if(request.getParameter("btneli")!=null) {
		 boolean x;
		 cedula=Long.parseLong(request.getParameter("ced"));
		 clidto=new ClienteDTO(cedula);
		 clidao=new ClienteDAO();
		 x=clidao.eliminar(clidto);
		 if(x)	{
			JOptionPane.showMessageDialog(null, "Dato se elimino") ;
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "Dato no se elimino") ;
		 }
			
		}
		
		
		
		
	}

}
