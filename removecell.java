package CONTROLER;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dbcell;
import DTO.Book;

@WebServlet("/remove")

public class removecell extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	long id=Long.parseLong(req.getParameter("id"));
	
	Book kk=new Book();
	kk.setId(id);
	dbcell dd=new dbcell();
	dd.Delete(id);
}
}
