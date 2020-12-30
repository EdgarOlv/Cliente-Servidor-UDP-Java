import java.util.*;
import java.io.*;
import java.net.*;

public class ServidorUDP {
	public static void main(String[] args)
		throws Exception{
		
		DatagramSocket s = new DatagramSocket(9000);
		byte buffer[] = new byte[1];
		DatagramPacket p = new DatagramPacket(buffer, buffer.length); // preparando pacote para recebimento
		
		System.out.println("Aguardando...");
		
		s.receive(p);
		
		byte r[] = p.getData();
		
		System.out.println(r[0]);
		
		s.close();
	}
}
