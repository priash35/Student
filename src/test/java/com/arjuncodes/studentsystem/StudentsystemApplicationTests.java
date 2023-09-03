package com.arjuncodes.studentsystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arjuncodes.studentsystem.controller.StudentController;
import com.arjuncodes.studentsystem.model.Student;

@SpringBootTest
class StudentsystemApplicationTests {
	@Autowired
	private StudentController sc;

	@Test
	void testAdd() {
		Student st = new Student();
		st.setName("priya");
		st.setAddress("dallas");
		
		sc.addFrist(st);
		
	}

}
