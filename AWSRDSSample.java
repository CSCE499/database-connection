import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

//import com.amazonaws.services.directconnect.model.Connection;

/**
 * @author SpringRoll
 *
 */
public class AWSRDSSample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://samplepractice.c6yw4amhyw8o.us-west-2.rds.amazonaws.com:3306/";
		String userName = "capstone2015";
		String password = "capstone2015";
		String dbName = "samplepractice";
		String driver = "com.mysql.jdbc.Driver";
		Connection connection = null;
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected to Database");
			String sql = "select * from user";
			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
		        String uName = rs.getString(1);
		        String uPass = rs.getString(2);
		        System.out.println(uName + " " + uPass);
		    }
			
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
	}
	

}
