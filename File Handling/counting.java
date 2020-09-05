import java.io.*;
public class counting{
public static void main(String[] args){
try{
FileReader fr = new FileReader("C:\\Users\\Siddharth Singh\\Desktop\\Java\\count.txt"); //opening the count file for reading
FileWriter fw = new FileWriter("C:\\Users\\Siddharth Singh\\Desktop\\Java\\countdup.txt"); //opening the countdup file for writing
int d;
do{
d=fr.read(); //reading count file character by character
fw.write(d); //writing countdup file character by character
}while(d!=-1);
//closing all opened files
fr.close();
fw.close();
}
catch(Exception e)
{
System.out.println(e.getMessage()); //displaying message for exception
}
}
}
