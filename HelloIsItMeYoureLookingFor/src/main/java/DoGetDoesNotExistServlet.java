import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/initServiceDestroy", initParams = {@WebInitParam(name="superSecret",value="I like to wear socks in the shower")})
public class DoGetDoesNotExistServlet extends HttpServlet {

    private String secret;

    @Override
    public void init() throws ServletException{
        System.out.println("This server is booting up");
        secret = getInitParameter("superSecret");
        System.out.println(secret);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("This Servlet is servicing!");

    }

    @Override
    public void destroy(){
        System.out.println("This Servlet will be destroyed now");
    }
}
