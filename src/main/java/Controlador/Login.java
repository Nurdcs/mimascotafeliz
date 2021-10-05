package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import Modelo.LoginDAO;
import Modelo.Usuarios_DTO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		HttpSession sesion=request.getSession();
		if(request.getParameter("btn")!=null){
	           
	            String u,c;
	            Usuarios_DTO usdto;
	            u=request.getParameter("usu");
	            c=request.getParameter("pas");
	            Usuarios_DTO lo=new Usuarios_DTO(u, c);
	            LoginDAO lodao=new LoginDAO();
	            usdto=lodao.login(lo);
	                   
	            String y="pepe";
	            sesion.setAttribute("llevadat",y );
	                 
	                  if(usdto.getUsuario().equals(u) && usdto.getPassword().equals(c)){
	                     JOptionPane.showMessageDialog(null, "Datos correctos");
	                     String uss=usdto.getNombre_Usuario(); 
	                     JOptionPane.showMessageDialog(null, uss);
	                     // sesion.setAttribute("vsusuario",lo.getUsuario());
	                   
	                     sesion.setAttribute("llevadato",uss );
	                     
	                     sesion.setAttribute("vs",usdto);
	                   
	                      request.getRequestDispatcher("menuprincipal.jsp").forward(request, response);
	                     
	                 }
	            }
	            else{
	                JOptionPane.showMessageDialog(null, "Datos incorrectos");
	                response.sendRedirect("index.jsp");
	            }

	            }
	}


