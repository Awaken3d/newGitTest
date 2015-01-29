import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class TestClient {

	public static void main(String[] args) {
		new TestClient().go();

	}
	
	public void go(){
		try {
			Socket sock = new Socket("localhost",5000);
			PrintWriter print = new PrintWriter(sock.getOutputStream());
			print.println("test message");
			print.flush();
			sock.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
