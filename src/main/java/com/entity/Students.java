package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
	
		
		@Value("1")
		private int id;
		@Value("Aku")
		private String name;
		@Value("IT")
		private String course;
		@Value("3l")
		private String fees;
		public Students() {
			
		}
		public Students(int id, String name, String course, String fees) {
			super();
			this.id = id;
			this.name = name;
			this.course = course;
			this.fees = fees;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getFees() {
			return fees;
		}
		public void setFees(String fees) {
			this.fees = fees;
		}
		@Override
		public String toString() {
			return "Students [id=" + id + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
		}
		
		
		
}
