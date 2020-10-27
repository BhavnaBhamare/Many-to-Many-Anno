package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import com.pojo.Department;
import com.pojo.Student;
import com.pojo.Teacher;

public class BLManager {

	SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();

	public void saveTeacher(Teacher t) {
		// TODO Auto-generated method stub
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		se.save(t);
		tr.commit();
		se.close();
	}

	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		se.save(s);
		tr.commit();
		se.close();
	}
	
	public void saveDepart(Department d) {
		// TODO Auto-generated method stub
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		se.save(d);
		tr.commit();
		se.close();
	}

	public Teacher searchTeacher(String tfname) {
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Teacher.class);
		cr.add(Restrictions.eq("tfname", tfname));
		Teacher a=(Teacher)cr.uniqueResult();
		return a;
	}

	public Student searchStudent(String sfname) {
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Student.class);
		cr.add(Restrictions.eq("sfname", sfname));
		Student st=(Student)cr.uniqueResult();
		return st;
	}
	
	public List<Teacher> serachTeacherlist()
	{
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Teacher.class);
		List<Teacher> tl=cr.list();
		return tl;
		
	}
	
	public List<Student> serachStudentlist()
	{
		Session s = sf.openSession();
		Criteria cr=s.createCriteria(Student.class);
		List<Student> sl=cr.list();
		return sl;
		
	}
}
