package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Bank;

public class BankMain {

		public static void main(String[] args) {
			ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigClass.class);
			Bank b=context.getBean(Bank.class);
			System.out.println(b);
		}
}
