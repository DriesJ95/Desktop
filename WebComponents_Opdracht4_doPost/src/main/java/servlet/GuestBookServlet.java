package servlet;

import database.GuestBookDao;
import domain.GuestBookBean;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

@WebServlet(value = "/servlet")
public class GuestBookServlet extends HttpServlet {
    public GuestBookDao guestBookDao = new GuestBookDao();

    @Override
    public void init() throws ServletException {
        System.out.println(Timestamp.from(Instant.now()) + ": Initializing connection");
        try{
            ServletContext context = getServletContext();
            Class.forName(context.getInitParameter("dbDriver"));
            guestBookDao = new GuestBookDao(context.getInitParameter("url"),context.getInitParameter("user"),context.getInitParameter("password"));
            System.out.println(Timestamp.from(Instant.now()) + ": The connection was established successfully");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Timestamp.from(Instant.now()) + ": Server received doGet-request");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        try(PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Title</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<H1>Current guestbook: </h1>");
            guestBookDao.getGuestBookItems().forEach((d) -> out.println("<pre>" + d.getDate() + ", " + d.getName() + ", " + d.getMessage() + "</pre>"));
            out.println("<br>");
            out.println("<form method='post' action=''>");
            out.println("<p>Geef hier je naam in: <input type='text' name='Name'></p>");
            out.println("<p>Geef hier je boodschap in: <input type='text' name='Message'>");
            out.println("<p><input type='submit' name='Add to DB'></p>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(Timestamp.from(Instant.now()) + ": Server replied to the doGet-request");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Timestamp.from(Instant.now()) + ": Server received doPost-request");
        String nName = req.getParameter("Name");
        String nMessage = req.getParameter("Message");
        try {
            guestBookDao.addGuestBookItem(new GuestBookBean(new Date(),nName, nMessage));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(Timestamp.from(Instant.now()) + ": Server successfully handled the to doPost-request" );
        doGet(req,resp);
    }
}
