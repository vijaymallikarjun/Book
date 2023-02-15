package CONTROLER;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.Book;

@WebServlet("/update")

public class update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long s1=Long.parseLong(req.getParameter("id"));
		String s2=req.getParameter("name");
		
		Book bk=new Book();
		bk.setId(s1);
		bk.setName(s2);
		dbcell db=new dbcell();
		db.update(s1,s2);
	}

}
