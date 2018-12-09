/*
  This java coding will do addition operation and can be test using putty and port specified.
  If using port 443, the HTML code will be encrypted but if using port 999, 
  It will show the calclulation of 888 + 10000 = 10888.
  The output will appear on the NetBean and can be captured by wireshark.

  Mohammad Ariff Bin Idris (2017430762)
*/
package sockethaiclient;

import java.io.*;
import java.net.*;
import java.util.*;

public class SocketHAIClient {

 public static void main(String argv[])
      {
	   try{
		    Socket socketClient= new Socket("localhost",999);
		    System.out.println("Client: "+"Connection Established");
 
		    BufferedReader reader = 
		    		new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
 
		    BufferedWriter writer= 
	        		new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));
		    String serverMsg;
		    writer.write("888\r\n");
		    writer.write("10000\r\n");
            writer.flush();
			while((serverMsg = reader.readLine()) != null){
				System.out.println("Client: " + serverMsg);
			}
 
	   }catch(Exception e){e.printStackTrace();}
      }
    
}
