package Ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberJoin.do")
public class C04Prac extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //헤더추가(한글깨짐 방지, html 코드 적용)
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //파라미터 받기
        String userid = req.getParameter("userid");
        String email = req.getParameter("email");
        String addr1 = req.getParameter("addr1");
        String addr2 = req.getParameter("addr2");


        //브라우저로 보낼 OUT객체 꺼내기
        PrintWriter out = resp.getWriter();

        //브라우저로 Code 전송
        out.println("USERID : "+userid);
        out.println("EMAIL : "+email);
        out.println("ADDR1 : "+addr1);
        out.println("ADDR2 : "+addr2);

    }


    //서블릿 파일 만들기 (url : /MemberJoin.do)
    //doPost함수 오버라이딩 하기
    //Form으로 부터 요청이 들어오면 해당 파라미터를 브라우저로 전송합니다
    //form에서 전송하는 내용은
    //userid, email, addr1, addr2 입니다.
    //04form.jsp를 만들어서 진행합니다.




}