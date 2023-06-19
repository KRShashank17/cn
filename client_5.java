import java.io.*;
import java.net.*;

public class client_5 {
    public static void main(String[] args) throws Exception{
        //ServerSocket ss= new ServerSocket(3333, 0, null);
        Socket s=new Socket("localhost",3333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout= new DataOutputStream(s.getOutputStream());
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

        String str1="",str2="";

        str1=br.readLine();
        dout.writeUTF(str1);
        dout.flush();
        
        str2=din.readUTF();
        System.out.println("Server says "+str2);

        din.close();
        s.close();


    }
}