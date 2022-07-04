package Ch01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GetTest.do")
public class C02DoGetTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //파라미터 받기
        String userid = req.getParameter("userid");
        String pwd = req.getParameter("pwd");

        //헤더추가(한글깨짐 방지, html 코드 적용)
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        //브라우저로 보낼 OUT객체 꺼내기
        PrintWriter out = resp.getWriter();

        //브라우저로 Code 전송
        out.println("USERID : "+userid);
        out.println("PWD : "+pwd);
    }
}
