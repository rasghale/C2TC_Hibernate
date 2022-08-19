package com.cg.service;


import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entity.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao;
	public StudentServiceImpl()
	{

	dao = new StudentDaoImpl();
	}
	@Override
	public Student setId(int id) {
		
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		// TODO Auto-generated method stub
	
		
	}
	
	}
	
