package myPackage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AccountOperations{
	static ResultSet rs = null;
	public static void createCustomerAccount(String customerid, String firstName, String username, String lastName, int age, String address,String mobileNumber, String eMailId, String dateofbirth, int balance) {
		try {
			String sql ="insert into customer(customerid,first_name,user_name,last_name,age,address,mobile_number,email_id,date_of_birth,balance ) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = Accounts.conn.prepareStatement(sql);
			stmt.setString(1, customerid);
			stmt.setString(2, firstName);
			stmt.setString(3, username);
			stmt.setString(4, lastName);
			stmt.setLong(5, age);
			stmt.setString(6, address);
			stmt.setString(7, mobileNumber);
			stmt.setString(8, eMailId);
			stmt.setString(9,dateofbirth);
			stmt.setLong(10, balance);
			int rows = stmt.executeUpdate();
			if(rows>0) {
				System.out.println("Records inserted successfully.....");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
