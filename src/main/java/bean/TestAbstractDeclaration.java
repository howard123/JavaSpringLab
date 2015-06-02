package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAbstractDeclaration {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		ConcreteA obj = (ConcreteA) context.getBean("concreteA");
		obj.printConcrete();

	}

}
