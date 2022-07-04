package Ch02;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/WEBINFTest.do")
public class C01Servlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("TEST");

        //Foward 방식
        RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/test.jsp");
        dis.forward(req,resp);
    }
}
