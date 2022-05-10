package pexam;

import java.net.UnknownHostException;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class JAndres {
    public static void main(String[] args) throws UnknownHostException{String host = "localhost"; compile(host); }

    static void compile(String host) {
        int ports = 500;
        for(int port = 1; port <= ports; port++){
            try{
                Socket socket = new Socket(host, port);
                System.out.println(host + ":" +""+ port + " is open");
                socket.close();
            }catch(Exception ignored){}
        }
    }
}