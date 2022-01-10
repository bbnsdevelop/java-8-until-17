package br.com.bbnsdevelop.sockets.basic;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(8080)) {
			Socket socket = serverSocket.accept();
			
			System.out.println("Connection established");
			
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			String data = dataInputStream.readUTF();
			System.out.println("Data receieved ".concat(data));
		} catch (IOException e) {
			e.printStackTrace();
		};
	}

}
