import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

@WebServlet("/doGet")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random rand = new Random();
        ArrayList<String> names = new ArrayList<>();
        names.add("Boris");
        names.add("Crouton");
        names.add("Draco");
        names.add("Fratsman");
        names.add("Georges");
        names.add("Jacques");
        names.add("Frigo");
        names.add("Zorro");
        System.out.println("Request received");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Title</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HELLO WORLD I AM A SERVLET!</h1>");
            out.println("Current request: " + request.toString());
            out.println("</p>");
            out.println("<p>");
            out.println("<button type='button'><a  href=''>Click Me!</a></button>");
            out.println("Current visitor: " + names.get(rand.nextInt(7)));
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){

        }
    }
}
