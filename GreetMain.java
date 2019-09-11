package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc/beans.xml");
		GreetName gn=(GreetName)context.getBean("greet");
		System.out.println("Hello: "+gn.getName());
	}

}
