import java.net.*;
import java.io.*;

public class server2 {
   public static void main(String[] args) throws IOException {

    ServerSocket ss=new ServerSocket(3000);
    Socket s=ss.accept();
    DataInputStream dint=new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    
    String fileName= dint.readUTF();
    BufferedReader br=new BufferedReader(new FileReader(fileName));
    
    String line;
    while((line=br.readLine())!=null)
    {
       dout.writeUTF(line); 
       dout.flush();
    }
    System.out.println("File contents are sent");
    
    br.close();
    dint.close();
    dout.close();
    ss.close();
    

   } 
}