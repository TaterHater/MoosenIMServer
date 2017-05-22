/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moosenimserver;


import java.io.*;
import java.net.*;

/**
 *
 * @author Nick Beeson
 */
public class MoosenIMServer {

  
     public static void main(String[] args) throws IOException {

   // if (args.length != 1) {
        
      //  System.exit(1);
   // }

        int portNumber = 5012;
        boolean listening = true;
        
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) { 
            while (listening) {
	            new KKMultiServerThread(serverSocket.accept()).start();
	        }
	    } catch (IOException e) {
            System.err.println("Could not listen on port " + portNumber);
            System.exit(-1);
        }
    }
    
    
    
    
    
    
    
//    //http://stackoverflow.com/questions/5680259/using-sockets-to-send-and-receive-data
//    public static Socket ssock = null;
//    public static User[] users;
//    public  DataOutputStream fromServer;
//   // public static DataInputStream in;
//    
//    //i know one is private and one is public, im testing something. 
//    private static BufferedReader toServer;
//    
//    public static void main(String[] args) {
//       
//        users = new User[10];
//        ServerSocket s2 = null;
//        while(true){
//        try{
//           ServerSocket serverSocket = new ServerSocket(5012);
//           Socket clientSocket = serverSocket.accept();
//        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//    BufferedReader in = new BufferedReader(
//        new InputStreamReader(clientSocket.getInputStream()));
//        } catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//       
//        }
//    }
    
}
