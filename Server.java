import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(5555);
		Socket socket = serversocket.accept();
		DataInputStream sdout = new DataInputStream(socket.getInputStream());
		System.out.println(sdout.readUTF());
	}

}
