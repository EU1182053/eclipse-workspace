package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
		Socket socket;
	
		
		public TCPServer() {
			System.out.println("Connection Establishment with Client");
			
			try(ServerSocket ss=new ServerSocket(2020);    ){
				System.out.println("Server is waiting for client request...... ");
				socket=ss.accept();
				System.out.println("Connection Established...........");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			TCPServer server=new TCPServer();
			
		}
}