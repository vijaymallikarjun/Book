package CONTROLER;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.Book;

@WebServlet("/login")

public class logcell extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long g1=Long.parseLong(req.getParameter("id"));
		String g2=req.getParameter("name");
		dbcell eb=new dbcell();
		Book gh=eb.find(g1);
		if(gh==null)
		{
			resp.getWriter().print("invalid id");
		}
		else
		{
			if(gh.getName().equals(g2))
			{
				resp.getWriter().print("login sucess");
			}
			else
			{
				resp.getWriter().print("<h1>invalid name</h1>");
				req.getRequestDispatcher("sigin.html").include(req, resp);
			}
		}
	}

}
