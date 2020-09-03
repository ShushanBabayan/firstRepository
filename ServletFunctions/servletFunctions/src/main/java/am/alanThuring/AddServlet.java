package am.alanThuring;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        if(req.getParameter("add") != null){
            int add = num1 + num2;
            PrintWriter out = res.getWriter();
            out.println(add);
        } else {
            if (req.getParameter("sub") != null) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/subtract");
                dispatcher.forward(req, res);
            } else {
                if (req.getParameter("mul") != null) {
                    RequestDispatcher dispatcher = req.getRequestDispatcher("/multiply");
                    dispatcher.forward(req, res);
                }
            }
        }
    }
}