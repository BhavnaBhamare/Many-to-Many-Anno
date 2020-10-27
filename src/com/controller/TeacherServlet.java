package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Teacher;

@WebServlet("/TeacherServlet")
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TeacherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	Teacher t=new Teacher();
	BLManager b=new BLManager();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String tfname=request.getParameter("tfname");
		String tlname=request.getParameter("tlname");
		String temail=request.getParameter("temail");
		String tgender=request.getParameter("tgender");
		String tphone=request.getParameter("tphone");
		String taddress=request.getParameter("taddress");
		String tdateofbirth=request.getParameter("tdateofbirth");
		
		t.setTfname(tfname);
		t.setTaddress(taddress);
		t.setTdateofbirth(tdateofbirth);
		t.setTemail(temail);
		t.setTgender(tgender);
		t.setTphone(tphone);
		t.setTlname(tlname);
		
		b.saveTeacher(t);
		response.sendRedirect("Index.jsp");
	}

}
