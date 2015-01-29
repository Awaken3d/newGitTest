import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer {

	public static void main(String[] args) {
		new TestServer().go();

	}
	
	public void go(){
		
		try {
			ServerSocket ss = new ServerSocket(5000);
			Socket sock = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			System.out.println(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
