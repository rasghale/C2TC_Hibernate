package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class StudentDaoImpl implements StudentDao{
private EntityManager manager;

	public StudentDaoImpl(){
		manager = JPAUtil.getEntityManager();
}
	@Override
	public Student getStudentById(int id) {
		Student student=manager.find(Student.class, id);
		return student;
	}
	

	@Override
	public void addStudent(Student student) {
		manager.persist(student);
		
	}

	@Override
	public void removeStudent(Student student) {
		manager.remove(student);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		manager.merge(student);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commitTransaction() {
		manager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beginTransaction() {
		manager.getTransaction().begin();
		// TODO Auto-generated method stub
		
	}

}
