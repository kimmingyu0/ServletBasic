package Ch02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Join.do")
public class C03Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/03MemberJoin.jsp").forward(req,resp);
    }
    //URL : /Join.do
    // -> doGet()으로 /WEB-INF/03MemberJoin.jsp로 Forward


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //헤더추가(한글깨짐 방지, html 코드 적용)
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        // /WEB-INF/03Result.jsp 에서 입력한 파라미터 email,pwd,addr1,addr2의 값 받아오기.
        String email = req.getParameter("email");
        String pwd = req.getParameter("pwd");
        String addr1 = req.getParameter("addr1");
        String addr2 = req.getParameter("addr2");

        // 받아온 값 출력하기
        System.out.println(email);
        System.out.println(pwd);
        System.out.println(addr1);
        System.out.println(addr2);

        // 받아온 값을 다시 /WEB-INF/03Result.jsp에 foward방식으로 전달
        req.getRequestDispatcher("/WEB-INF/03Result.jsp").forward(req,resp);
    }
}



