package jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"jdbc/Spring-JdbcApp.xml");

		JDBCEmployeeDAOImpl obj = (JDBCEmployeeDAOImpl) context
				.getBean("employeeDAO");
		Employee emp1 = new Employee();
		emp1.setId(3);
		emp1.setFirst_name("ed");
		emp1.setLast_name("shield");

		obj.insert(emp1);

		Employee employee4 = obj.findById(3);
		System.out.println(employee4);

	}

}
