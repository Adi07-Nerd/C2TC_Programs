package database.usingProperty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest2 {

	public static void main(String[] args) {
		Connection connection = DBUtil2.getConnection();
		if (connection != null)
			System.out.println("JDBC:connection is taken..");
		try {
			String sql = "CREATE DEFINER=`root`@`localhost` PROCEDURE `First_Procedure` ()\r\n" + "BEGIN\r\n"
					+ "	INSERT INTO `c2tc`.`employee_table`(`employee_name`,`emaill`,`esalary`,`bonus`,`doj`)\r\n"
					+ "    VALUES(\"Rex\",\"BahotSaariErasers@gmail.com\",20000,2000,\"2021-11-25\");\r\n" + "    \r\n"
					+ "	INSERT INTO `c2tc`.`employee_table`(`employee_name`,`emaill`,`esalary`,`bonus`,`doj`)\r\n"
					+ "    VALUES(\"Kshitij\",\"tenAndHalf@gmail.com\",10500,250,\"2021-01-25\");\r\n" + "    \r\n"
					+ "	INSERT INTO `c2tc`.`employee_table`(`employee_name`,`emaill`,`esalary`,`bonus`,`doj`)\r\n"
					+ "    VALUES(\"Aditya\",\"jyadaGyaanMatDe@gmail.com\",1000,200,\"2021-11-05\");\r\n" + "    \r\n"
					+ "    INSERT INTO `c2tc`.`employee_table`(`employee_name`,`emaill`,`esalary`,`bonus`,`doj`)\r\n"
					+ "    VALUES(\"Dinesh\",\"ekMeDown@gmail.com\",10,20,\"2021-11-05\");\r\n" + "    \r\n"
					+ "    update `c2tc`.`employee_table`\r\n"
					+ "	set `employee_name`='Notorious',`emaill`='NotoOp@gmail.com' where `demployee_id`=5;\r\n" 
					+ "END";
			
			Statement st = connection.createStatement();
			int i = st.executeUpdate(sql);
			System.out.println("Number of rows effected: "+i);

			PreparedStatement cs = connection.prepareCall("{call First_Procedure()}");
			int i1 = cs.executeUpdate();
			System.out.println(i1);
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}

		try {
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
