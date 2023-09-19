package anudeep.org;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class DemoUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Anudeep", "root", "V@msi2002");
		PreparedStatement  pst=con.prepareStatement("update emp set ename=? where eid=?");
		pst.setString(1, "Vamsi");
		pst.setInt(2, 2);
		int i=pst.executeUpdate();
		System.out.println("No.of rows Updated"+i);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select ename from emp where eid=2");
		while(rs.next())
			System.out.println(rs.getString("ename"));
		con.close();
		pst.close();
	}
}

