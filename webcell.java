package CONTROLER;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.Book;

@WebServlet("/sigin")

public class webcell  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Book ok=new Book();
		ok.setId(Long.parseLong(req.getParameter("id")));
		ok.setName(req.getParameter("name"));
		ok.setPages(Long.parseLong(req.getParameter("pages")));
		ok.setAuthor(req.getParameter("author"));
		ok.setPrice(Long.parseLong(req.getParameter("price")));
		ok.setCount(Long.parseLong(req.getParameter("count")));
		
		dbcell db=new dbcell();
		db.send(ok);
		resp.getWriter().print("signin sucess");
	}
	

}
