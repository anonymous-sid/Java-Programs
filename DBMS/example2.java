package demo;

import java.sql.DriverManager;

public class DBConnect {

 public static void main(String[] args) {
// TODO Auto-generated method stub
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver registered");
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sachin");
System.out.println("database connected");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
