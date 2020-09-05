import java.io.*;
public class FH{
public static void main(String[] args){
try{
FileWriter fw = new FileWriter("C:\\Users\\Siddharth Singh\\Desktop\\Java\\count.txt"); // writing a file using character by character format
fw.write("1 2 3 4 5 6 7 8 9");
fw.close(); //closing the file

FileReader fr = new FileReader("C:\\Users\\Siddharth Singh\\Desktop\\Java\\count.txt"); //reading file using character by character format
int d;
//making new files as odd.txt and even.txt
FileWriter fe = new FileWriter("C:\\Users\\Siddharth Singh\\Desktop\\Java\\even.txt");
FileWriter fo = new FileWriter("C:\\Users\\Siddharth Singh\\Desktop\\Java\\odd.txt");
do{
d=fr.read();
if(d%2==0){
fe.write(d); //writing even numbers of count.txt into even.txt
}
else{
fo.write(d); //writing odd numbers of count.txt into odd.txt
}
System.out.println((char)d);
}while(d!=-1);
//closing all open files
fr.close();
fe.close();
fo.close();
}
catch(Exception e)
{
System.out.println(e.getMessage()); //printing message for any exception
}
}
}
