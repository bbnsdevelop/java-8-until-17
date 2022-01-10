package br.com.bbnsdevelop.sockets.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	
	public static void main(String[] args) {
		try {
			ServerSocket socketServer = new ServerSocket(9090);
			Socket socket = socketServer.accept();
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String messageReceved="", messageTosend="";
			while(true) {
				messageReceved = in.readUTF();
				if(messageReceved != null && messageReceved.contains("bye")) {
					break;
				}
				System.out.println("Client Says: ".concat(messageReceved));
				messageTosend  = reader.readLine();
				
				out.writeUTF(messageTosend);
				out.flush();
				
			}

			reader.close();
			out.close();
			in.close();
			socket.close();
			socketServer.close();			
			
		} catch (IOException e) {			
			e.printStackTrace();			
		}
		
	}

}
