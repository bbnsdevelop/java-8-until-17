package br.com.bbnsdevelop.sockets.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClient {
	
	public static void main(String[] args) {
		try {
			
			Socket socket = new Socket("localhost", 9090);
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String messageReceved="", messageTosend="";
			while(true) {
				messageTosend = reader.readLine();
				out.writeUTF(messageTosend);
				out.flush();
			 	messageReceved =  in.readUTF();
			 	if(messageReceved != null && messageReceved.contains("bye")) {
					break;
				}
			 	System.out.println("Server Says: ".concat(messageReceved));
				
			}

			reader.close();
			out.close();
			in.close();
			socket.close();
			
		} catch (IOException e) {			
			e.printStackTrace();			
		}
	}

}
