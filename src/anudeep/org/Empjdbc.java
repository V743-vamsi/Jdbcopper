package anudeep.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Empjdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Anudeep", "root", "V@msi2002");
		PreparedStatement  st = con.prepareStatement("insert into emp values(?,?)");
		st.setInt(1,201);
		st.setString(2, "nikhil");
		int r=st.executeUpdate();
		if(r>0)
			System.out.println("Rows Inserted");
		else
			System.out.println("Rows not inserted");
		con.close();
		st.close();
	}
}


