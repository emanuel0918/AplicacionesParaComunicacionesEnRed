import java.net.*;
import java.io.*;
public class SHM{
 public static void main(String []args){
  try{
   int pto =8000;
   ServerSocket s= new ServerSocket(pto);
   System.out.println("Servicio iniciado: esperando cliente en el puerto "+pto);
   for(;;){
    Socket cl=s.accept();
    System.out.println("Cliente conectado InetAddres: "+cl.getInetAddress()+" "+
		    cl.getPort());
    DataOutputStream dos = new DataOutputStream(cl.getOutputStream());
    int v1=1;
    float v2=2.0f;
    String v3="String";
    System.out.println("Enviando los datos:\nint: "+v1+"\nfloat: "+v2+
		    "\nString: "+v3);
    dos.writeInt(v1);
    dos.flush();
    dos.writeFloat(v2);
    dos.flush();
    dos.writeUTF(v3);
    dos.flush();
    dos.close();
    cl.close();
   }//for
  }catch(Exception e){
  }//try
 }
}
