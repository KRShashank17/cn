import java.io.*;
import java.net.*;
import java.util.*;

public class client2 {
   public static void main(String[] args) throws IOException{

     Socket s=new Socket("localhost",3000);   
     DataInputStream dint=new DataInputStream(s.getInputStream());
     DataOutputStream dout=new DataOutputStream(s.getOutputStream());
     
     Scanner s1=new Scanner(System.in);
     System.out.println("Enter the filename");
     String fileName=s1.next();

     dout.writeUTF(fileName);
     dout.flush();
     
     String Fileread;
     while((Fileread=dint.readUTF())!=null)
     {
       System.out.println(Fileread);
     }

     s1.close();
     dint.close();
     dout.close();
     s.close();

   } 
}