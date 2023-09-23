package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/respuesta")
public class repuesta extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 		
 		String name = req.getParameter("nombre");
 		
 		PrintWriter pw = resp.getWriter();
 		
 		pw.println("<html>");
 		pw.println("<body>");
 		pw.println("Hola te llamas " + name);
 		pw.println("</body>");
 		pw.println("</html>");
	}

}
