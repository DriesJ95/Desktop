package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/helloRandom")
public class HelloRandomController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random rand = new Random();
        switch (rand.nextInt(4)){
            case 0:
                req.getRequestDispatcher("/WEB-INF/pages/helloCalculator.jsp").forward(req, resp);
                break;
            case 1:
                req.getRequestDispatcher("/WEB-INF/pages/helloJSP.jsp").forward(req, resp);
                break;
            case 2:
                req.getRequestDispatcher("/WEB-INF/pages/helloSession.jsp").forward(req, resp);
                break;
            case 3:
                req.getRequestDispatcher("/WEB-INF/pages/helloWorld.jsp").forward(req, resp);
                break;

        }
    }
}
