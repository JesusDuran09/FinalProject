import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 5555);
		DataOutputStream cdout = new DataOutputStream(socket.getOutputStream());
		cdout.writeUTF("Enter A Prime Number");
	}

}
