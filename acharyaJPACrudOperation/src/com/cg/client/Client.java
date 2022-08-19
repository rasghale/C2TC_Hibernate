package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		Student student=new Student();
		StudentService service=new StudentServiceImpl();
	
		student.setId(12);
		student.setName("Ras");
		service.addStudent(student);
		student=service.setId(1);
	
		System.out.println("Id is:"+ service.setId(0));
		System.out.println("Name is:"+ student.getName());
	

	student=service.setId(12);
	student.setName("Ras BG");
	service.updateStudent(student);
	System.out.println("Del");
	}
}