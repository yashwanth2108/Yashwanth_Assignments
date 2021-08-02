package com.Resourseannotation.Resourse;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		 
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/Resourseannotation.Resourse/resource-annotation.xml");
 
        Employee emp = ac.getBean("myemployee", Employee.class);
        System.out.println(emp.toString());
    }

}