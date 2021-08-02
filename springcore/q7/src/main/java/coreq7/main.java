package coreq7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/coreq7/config.xml");
		example e=(example) context.getBean("example");
		System.out.println(d);

	}

}
