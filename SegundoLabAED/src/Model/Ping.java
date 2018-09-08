package Model;

import java.io.IOException;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ping { 
	
	 public static void main(String args[]) throws UnknownHostException, IOException {
	       
		 InetAddress localHost = InetAddress.getLocalHost();
		 System.out.println(localHost.getHostName());
		 System.out.println(localHost.getHostAddress());
	 }
}