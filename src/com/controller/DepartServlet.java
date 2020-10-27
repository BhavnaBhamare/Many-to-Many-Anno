package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Department;
import com.pojo.Student;
import com.pojo.Teacher;

@WebServlet("/DepartServlet")
public class DepartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DepartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    Department d=new Department();
    Student s=new Student();
    Teacher t=new Teacher();
    BLManager b=new BLManager();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String dname=request.getParameter("dname");
		String demail=request.getParameter("demail");
		String dphone=request.getParameter("dphone");
		String tfname=request.getParameter("tfname");
		String sfname=request.getParameter("sfname");
		
		t=b.searchTeacher(tfname);
		s=b.searchStudent(sfname);
		
		d.setDemail(demail);
		d.setDname(dname);
		d.setDphone(dphone);
		d.setStudent(s);
		d.setTeacher(t);
		
		b.saveDepart(d);
		response.sendRedirect("Index.jsp");
		
	}

}
