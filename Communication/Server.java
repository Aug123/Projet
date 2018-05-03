import java.io.*;
import java.net.*;

public class ReverseStringServer {

	public static void main(String[] args) throws Exception {
		// Create server socket listening on port
		int port = 1234;
		ServerSocket serverSocket = new ServerSocket(port);

		// Declare client socket
		Socket clientSocket;

		while (true) { // Provide service continuously
			clientSocket = serverSocket.accept();

			ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());

			String s = (String) in.readObject();

			out.writeObject(result);
			out.flush();
			
			out.close();
			in.close();
			clientSocket.close();
		}
	}

}
