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

    
    //http://stackoverflow.com/questions/5680259/using-sockets-to-send-and-receive-data
    public static Socket ssock = null;
    public static User[] users;
    public  DataOutputStream fromServer;
    public static DataInputStream in;
    
    //i know one is private and one is public, im testing something. 
    private static BufferedReader toServer;
    
    public static void main(String[] args) {
       
        users = new User[10];
        ServerSocket s2 = null;
        try{
            ssock = new Socket("localhost",5012);
              //toServer = new BufferedReader(new InputStreamReader(ssock.getInputStream()));
               in = new DataInputStream(ssock.getInputStream());
                while(!ssock.isClosed()){
              
            String b = in.readUTF();
            System.out.println(b);
            
        }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
       
        
    }
    
}
