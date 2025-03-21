package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Employee;
import com.entity.Students;

public class StudMain {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigClass.class);
		Students s= context.getBean(Students.class);
		System.out.println(s);
	}
}
