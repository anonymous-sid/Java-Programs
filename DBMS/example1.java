package demo;


public class DBConnect {

 public static void main(String[] args) {
// TODO Auto-generated method stub
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver registered");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
