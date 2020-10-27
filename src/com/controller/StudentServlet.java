package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Student;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    Student s=new Student();
    BLManager b=new BLManager();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sfname=request.getParameter("sfname");
		String slname=request.getParameter("slname");
		String sfaname=request.getParameter("sfaname");
		String smname=request.getParameter("smname");
		String semail=request.getParameter("semail");
		String sgender=request.getParameter("sgender");
		String sphone=request.getParameter("sphone");
		String saddress=request.getParameter("saddress");
		String sdateofbirth=request.getParameter("sdateofbirth");
		
		s.setSaddress(saddress);
		s.setSdateofbirth(sdateofbirth);
		s.setSemail(semail);
		s.setSfaname(sfaname);
		s.setSfname(sfname);
		s.setSphone(sphone);
		s.setSgender(sgender);
		s.setSmname(smname);
		s.setSlname(slname);
		
		
		b.saveStudent(s);
		response.sendRedirect("Index.jsp");
	}

}
