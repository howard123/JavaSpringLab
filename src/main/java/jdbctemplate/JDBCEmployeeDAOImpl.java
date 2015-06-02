package jdbctemplate;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCEmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Employee employee) {
		// TODO Auto-generated method stub

		String sql = "INSERT INTO EMP "
				+ "(ID, first_name, last_name) VALUES (?, ?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,
				new Object[]{employee.getId(), employee.getFirst_name(),
						employee.getLast_name()});

	}

	public Employee findById(int id) {
		// TODO Auto-generated method stub

		String sql = "SELECT * FROM EMP WHERE ID = ?";

		jdbcTemplate = new JdbcTemplate(dataSource);
		Employee employee = (Employee) jdbcTemplate.queryForObject(sql,
				new Object[]{id}, new EmployeeRowMapper());

		return employee;
	}

}
