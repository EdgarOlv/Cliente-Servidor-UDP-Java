import java.net.*;
import java.io.*;
import java.util.*;

public class ClienteUDP {
	public static void main(String[] args)
		throws Exception{
		
		DatagramSocket s = new DatagramSocket(); // envio e recebimento
		byte info = 10;
		byte buffer[] = new byte[1]; //buffer de 1 posição
		buffer[0] = info;
		InetAddress end = InetAddress.getLocalHost();  //pega ip
		DatagramPacket p  = new DatagramPacket(buffer,buffer.length,end,9000);
		//                                     Mensagem,Tamanho, Endereço, Porta
		
		System.out.println("enviar pacote...");
		s.send(p); // enviar chamando o DatagramSocket a mensagem no DatagramPacket
		s.close();
	}
}

