package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import Modelo.UsuariosDAO;
import Modelo.Usuarios_DTO;


/**
 * Servlet implementation class Usuarios
 */
@WebServlet("/Usuarios")
public class Usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuarios() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		UsuariosDAO usuDAO= new UsuariosDAO();
		
		if(request.getParameter("insertar")!=null) {
		 long cedula;
		 String nombre,correo,usuario,pass;
		 cedula= Long.parseLong(request.getParameter("cedula"));
		 nombre = request.getParameter("nombre");
		 correo = request.getParameter("correo");
		 usuario = request.getParameter("usuario");
		 pass = request.getParameter("pass");
		 Usuarios_DTO usuDTO= new Usuarios_DTO(cedula,nombre,correo,usuario,pass);
		 if(usuDAO.Inserta_Usuario(usuDTO)){
			 JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente");
			 response.sendRedirect("Usuarios.jsp");
		 }else {
			 JOptionPane.showMessageDialog(null, "Usuario No se registro");
			 response.sendRedirect("Usuarios.jsp");
		 }
		}
		
	//Para Consultar
	
		if(request.getParameter("consultar")!=null) {
			
			long cedula=Long.parseLong(request.getParameter("cedula"));
			String nombre,correo,usuario,pass;
			Usuarios_DTO usuDTO=usuDAO.Buscar_Usuario(cedula);
			cedula= usuDTO.getCedula_Usuario();
			nombre = usuDTO.getNombre_Usuario();
			correo = usuDTO.getEmail_Usuario();
			usuario = usuDTO.getUsuario();
			pass = usuDTO.getPassword();
			response.sendRedirect("Usuarios.jsp?cedula="+cedula+"&&nombre="+nombre+"&&correo="+correo
					+"&&usuario="+usuario+"&&pass="+pass);
		}
		
	}

}
