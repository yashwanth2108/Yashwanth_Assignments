package coreq1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("coreq1/config.xml");
		Employee1 emp=(Employee1) context.getBean("emp");
		System.out.println(emp);
	}

}
