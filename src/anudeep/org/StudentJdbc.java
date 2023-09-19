package anudeep.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudeep", "root", "V@msi2002");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select sname from student");
        while(rs.next())
        	System.out.println(rs.getString("sname"));
        con.close();
        st.close();
        rs.close();
	}

}