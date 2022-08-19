package com.cg.service;

import com.cg.entity.Student;

public interface StudentService {
	public abstract Student setId(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
    
	
}
