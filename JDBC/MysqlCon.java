import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
    System.out.println("Testing");
    Class.forName("com.mysql.jdbc.Driver");  
	  Connection con=DriverManager.getConnection(  
	  "jdbc:mysql://localhost:3308/student","root","password");
	  //here sonoo is database name, root is username and password  
	  //System.out.println("Demo");
	  Statement stmt=con.createStatement();  
	  ResultSet rs=stmt.executeQuery("select * from student");
	System.out.println("ID" + " " + "Attendance" + " " + "Branch");
	  while(rs.next()) {

		  System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

	  }
	con.close();
}catch(Exception e){ System.out.println(e);}  
}  
}  