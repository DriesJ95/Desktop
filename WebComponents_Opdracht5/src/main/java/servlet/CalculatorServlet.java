package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Calculator")
public class CalculatorServlet extends HttpServlet {
    private final String RESULT = "CaculatorServlet.result";
    private final String NUMBER = "number";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sessionList;
        HttpSession session = req.getSession();
        Object resultAttribute = session.getAttribute(RESULT);
        if ((sessionList = (String) session.getAttribute("sessionList")) == null){
            session.setAttribute("sessionList","0");
            sessionList = "0";
        }

        int result = 0;
        if (resultAttribute != null){
            result = (Integer) resultAttribute;
        }

        String message = "";
        Object messageAttribute = req.getAttribute("message");
        if (messageAttribute != null) {
            message = (String) messageAttribute;
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        try (PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Calculator</title></head><body>");
            out.print("<form method = 'post'>");
            out.print(message + "<br />");
            out.println("Result: " + result + "<br/>");
            out.println("<input type='number' name='number' /><br>");
            out.println("<input type = 'submit' name = 'operation' value='+'>");
            out.println("<input type = 'submit' name = 'operation'  value='-'>");
            out.println("<input type = 'submit' name = 'operation'  value='*'>");
            out.println("<input type = 'submit' name = 'operation'  value='/'>");
            out.println("<input type = 'submit' name = 'operation'  value='CE'>");
            out.println("<p>" + sessionList + "</p>");
            out.println("</form></body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int result = 0;
        String message = "";
        String operation = req.getParameter("operation");

        HttpSession session = req.getSession();
        Object resultAttribute = session.getAttribute(RESULT);
        String sessionList = (String) session.getAttribute("sessionList");
        if(resultAttribute != null){
            result = (Integer) resultAttribute;
        }

        String numberParameter = req.getParameter(NUMBER);
        if(numberParameter != null){
            switch (operation){
                case "+":
                    try{
                        result += Integer.parseInt(numberParameter);
                    }catch (NumberFormatException ex){
                        message = "Invalid number";
                    }
                    sessionList = sessionList.concat("<pre> + " + numberParameter + " = " + result + " </pre>");
                    break;
                case "-":
                    try{
                        result -= Integer.parseInt(numberParameter);
                    }catch (NumberFormatException ex){
                        message = "Invalid number";
                    }
                    sessionList = sessionList.concat("<pre> - " + numberParameter + " = " +  result + " </pre>");
                    break;
                case "*":
                    try{
                        result *= Integer.parseInt(numberParameter);
                    }catch (NumberFormatException ex){
                        message = "Invalid number";
                    }
                    sessionList = sessionList.concat("<pre> * " + numberParameter + " = " +  result + " </pre>");
                    break;
                case "/":
                    try{
                        result /= Integer.parseInt(numberParameter);
                    }catch (NumberFormatException ex){
                        message = "Invalid number";
                    }
                    sessionList = sessionList.concat("<pre> / " + numberParameter + " = " +  result + " </pre>");
                    break;
                case "CE":
                    try{
                        result = 0;
                    }catch (NumberFormatException ex){
                        message = "Invalid number";
                    }
                    sessionList = sessionList.concat("<pre> !cleared everything! </pre>");
                    break;
            }

        }

        req.setAttribute("message", message);
        session.setAttribute(RESULT, result);
        session.setAttribute("sessionList", sessionList);
        doGet(req, resp);
    }
}
