package PackageEmp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	  static final String url = "jdbc:mysql://localhost:3306/Payroll";
      static final  String user = "root";
      static final String password = "Db_Password";
     
	public static Connection getconnection() {
		Connection con = null;
		
		try {
			 con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}

}
