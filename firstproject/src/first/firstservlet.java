package first;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class firstservletg
 */
@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public firstservlet() {
        // TODO Auto-generated constructor stub
    }
 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    out.println("<HTML>");
    out.println("<Head><title>exotica Travel</title></head>");
    out.println("<Body>");
    out.println("<h1><center>Exotica Travel</center></h1>");
    out.println("<Div>");
    out.println("<Border>");
    out.println("<form border=1>LOGIN AS</br>");
    out.println("<input type=\"radio\" name=\"Existing User\" value=\"Existing User\" checked> Existing User<br>");
    out.println("<input type=\"radio\" name=\"New User\" value=\"New User\" > New User<br>");
    out.println("<input type=\"submit\" value=\"Submit\">");
    out.println("</form>");
    out.println("</Border>");
    out.println("</div>");
    out.println("</body></HTML>");
 }
 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }
}