package anudeep.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DemoBatch {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Anudeep", "root", "V@msi2002");	
		Statement  st = con.createStatement();
		st.addBatch("insert into emp values(8,'Sam')");
		st.addBatch("insert into emp values(9,'Ram')");
		st.addBatch("insert into emp values(7,'Sai')");
		int[] i =st.executeBatch();
		System.out.println(i.length);
		con.close();
		st.close();
	}
}
