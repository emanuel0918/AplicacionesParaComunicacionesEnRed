import java.io.*;
import java.net.*;
public class CECO{
 public static void main(String []args){
  try{
   int pto=1234;
   String host="localhost";
   Socket cl=new Socket(host,pto);
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   PrintWriter pw=new PrintWriter(new OutputStreamWriter(cl.getOutputStream()));
   BufferedReader br1=new BufferedReader(new InputStreamReader(cl.getInputStream()));
   while(true){
    System.out.println("Excribe una cadena, <ENTER> para enviar, \"salir\" para terminar");
    String datos=br.readLine();
    if(datos.compareToIgnoreCase("salir")==0){
     pw.println(datos);
     pw.flush();
     br.close();
     br1.close();
     pw.close();
     cl.close();
     System.exit(0);

    }else{
     pw.println(datos);
     pw.flush();
     String eco=br1.readLine();
     System.out.println("Eco recibido: "+eco);
    }
   }
  }catch(Exception e){
  }
 }
}
