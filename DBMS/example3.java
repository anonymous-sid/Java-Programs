package demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class DBConnect {

 public static void main(String[] args) {
// TODO Auto-generated method stub
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver registered");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sachin");
System.out.println("database connected");

Statement st=con.createStatement();
st.execute("insert into Mobile values('Nokia1100',1100,2,20,'abc')");
System.out.println("data inserted");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
