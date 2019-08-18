import java.net.*;
import java.io.*;
public class CHM{
 public static void main(String []args){
  try{
   int pto = 8000;
   String host ="127.0.0.1";//localhost
   Socket cl=new Socket(host,pto);
   System.out.println("Conexion con servidor establecida...\nrecibiendo informacion");
   DataInputStream dis=new DataInputStream(cl.getInputStream());
   int v1=dis.readInt();
   float v2=dis.readFloat();
   String v3 =dis.readUTF();
   System.out.println("Datos recibidos:\nv1: "+v1+"\nv2: "+v2+"\nv3: "+v3);
   dis.close();
   cl.close();
   System.out.println("Terminar programa");
  }catch(Exception e){
  }
 }
}

