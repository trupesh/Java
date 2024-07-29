import java.sql.*;  
class PreparedStatementExample{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/surveyapplication","root","password");  
  
PreparedStatement stmt=con.prepareStatement("insert into login_data values(?,?,?)");  
stmt.setInt(1,103);//1 specifies the first parameter in the query
stmt.setString(2,"Rahul");
stmt.setString(3,"Rahul123");
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
ResultSet rs=stmt.executeQuery("select * from login_data");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//con.close();   
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  