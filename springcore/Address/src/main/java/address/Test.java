package address;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/address/Configuration.xml");
		Customer customer=(Customer) context.getBean("customer1");
		
		System.out.println(customer);
	}
}