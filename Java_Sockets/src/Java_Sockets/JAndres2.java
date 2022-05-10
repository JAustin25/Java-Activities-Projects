package pexam;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class JAndres2{
    public static void main(String[] args){
        int portsM = 2001;
        for(int port = 1; port <= portsM; port++){
            new Thread(new Ports(port)).start();}
    }
}

class Ports implements Runnable{
    int ports;
    Ports(int port){this.ports = port; }

    public void run() {
        try{

            String hostName = "www.slu.edu.ph";
            Socket socket = new Socket(hostName, ports);
            socket.close();
            System.out.println(hostName + ": " + ports + " is open");
        }catch(Exception ignored){}
    }
}

