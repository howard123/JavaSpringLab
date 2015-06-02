package jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		employee.setId(rs.getInt("ID"));
		employee.setFirst_name(rs.getString("first_name"));
		employee.setLast_name(rs.getString("last_name"));
		return employee;

	}

}
