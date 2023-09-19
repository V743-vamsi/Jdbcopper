package anudeep.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DemoDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Anudeep", "root", "V@msi2002");
		PreparedStatement  pst=con.prepareStatement("delete from emp where eid=?");
		pst.setInt(1, 8);
		int i=pst.executeUpdate();
		System.out.println("No.of rows deleted:"+i);
		con.close();
		pst.close();
	}

}
