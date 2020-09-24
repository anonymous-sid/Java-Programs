package demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;

public class DBConnect {

 public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter model name");
String model=sc.nextLine();
System.out.println("enter price");
int p=sc.nextInt();
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver registered");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sachin");
System.out.println("database connected");

Statement st=con.createStatement();
st.execute("insert into Mobile values('"+model+"',"+p+",2,20,'abc')");
System.out.println("data inserted");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
