package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ClientTest {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBUtil1.getConnection();
		if(connection !=null)
			System.out.println("JDBC:connection is taken....");
		Statement st = connection.createStatement();
		Scanner input=new Scanner(System.in);
		System.out.println("1.Insert\t2.Delete.\t3.Update.\t4.Read");
		int ch=input.nextInt();
		System.out.println("Enter your query below:");
		input.nextLine();
		String query=input.nextLine();
		input.close();
		
		switch(ch) {
		case 1:
		case 2:
		case 3:
			update(st, query);
			break;
		case 4:
			read(st, query);
			break;
		default:
			System.out.println("Please select valid option");
			
		}
		
		try
		{
			connection.close();
			st.close();
		}catch(Exception e)
		{
			System.out.println("Oooops: "+e.getMessage());
		}

	}
	
	public static void update(Statement st,String query)
	{
		try
		{
		int executeUpdate = st.executeUpdate(query);
		System.out.println("No. of row effected: "+executeUpdate);
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void read(Statement st,String query)
	{
		try {
			ResultSet s = st.executeQuery(query);
			while(s.next())
			{
				System.out.println();
				System.out.print("Id: "+s.getInt(1)+" ");
				System.out.print("\tName: "+s.getString(2)+" ");
				System.out.print(s.getString(3)+" ");
				System.out.print("\n"+s.getString(4)+" ");
				System.out.print(s.getString(5)+" ");
				System.out.print("\nPhone: "+s.getString(6)+"\n");
			}	
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
