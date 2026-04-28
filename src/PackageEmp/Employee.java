package PackageEmp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public void AddEmployee(int id , String name , double basic, double bonus)  {
		double total = basic + bonus;
		try {
		Connection con = DBConnection.getconnection();
		String query = "INSERT INTO employees (id, name, basic_salary, bonus, total_salary) values (?, ?, ?, ?, ?)";
		
			PreparedStatement ps =con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, basic);
			ps.setDouble(4, bonus);
			ps.setDouble(5, total);
			
			ps.executeUpdate();
            System.out.println("Employee added successfully!");
            con.close();
            
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



public void showEmployees() {
    try {
        Connection con = DBConnection.getconnection();

        String query = "SELECT * FROM employees";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        System.out.println("\n--- Payroll Report ---");

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + "  " +
                rs.getString("name") + "  " +
                rs.getDouble("basic_salary") + "  " +
                rs.getDouble("bonus") + "  " +
                rs.getDouble("total_salary")
            );
        }

        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
