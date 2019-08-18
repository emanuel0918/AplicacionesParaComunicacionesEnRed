import java.net.*;
import java.io.*;
public class SECO{
 public static void main(String []args){
  try{
   int pto = 1234;
   ServerSocket s=new ServerSocket(pto);
   System.out.println("Servicio iniciado en el ppuerto "+pto+
		   "\nesperando cliente...");
   for(;;){
    Socket cl=s.accept();
    PrintWriter pw=new PrintWriter(new OutputStreamWriter(cl.getOutputStream()));
    BufferedReader br=new BufferedReader(new InputStreamReader(cl.getInputStream()));
    while(true){
     String msj=br.readLine();
     if(msj.compareToIgnoreCase("salir")==0){
      System.out.println("Termina ciente");
      br.close();
      pw.close();
      cl.close();
      break;
     }else{
      System.out.println("Mensaje recibido "+msj+"\ndevolviendo eco");
      pw.println(msj);
      pw.flush();
     }
    }
   }
  }catch(Exception  e){
  }
 }
}
