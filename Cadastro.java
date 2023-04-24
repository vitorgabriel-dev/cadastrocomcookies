import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	     ServletException,IOException {	
			try{
				String info1 = request.getParameter("info1");
				String info2 = request.getParameter("info2");
				String info3 = request.getParameter("info3");
				  Cookie cookie1 = new Cookie("infopessoal", "info1");
		    	  Cookie cookie2 = new Cookie("infoacademica", "info2");
		    	  Cookie cookie3 = new Cookie("infoprofissional", "info3");			    	  
		    	  response.addCookie(cookie1);
		    	  response.addCookie(cookie2);
		    	  response.addCookie(cookie3);
				PrintWriter writer = response.getWriter();
				writer.append( " <HTML>  <BODY> " );
				writer.append("Informações pessoais: " + info1 + " Informações acadêmicas: " + info2 + " Informações profissionais: " + info3);
				writer.append( "</BODY>  </HTML>" );
			} catch (IOException e){
				e.printStackTrace();
			}
		}   
	}