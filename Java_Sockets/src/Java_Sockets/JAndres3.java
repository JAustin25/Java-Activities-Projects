package pexam;

import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.net.Socket;
import java.util.regex.Matcher;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class JAndres3 {

    public static void main(String[] args){ compile();  }
    private static void compile() {
        int port = 12001;

        try (

                ServerSocket sSocket = new ServerSocket(port);
                Socket cSocket = sSocket.accept();
                PrintWriter streamWtr = new PrintWriter(cSocket.getOutputStream(), true);
                BufferedReader streamRdr = new BufferedReader(new InputStreamReader(cSocket.getInputStream()))
        ) {
            String input = "";
            input = streamRdr.readLine();

            while (true) {

                boolean SpecialCharacters1 = ScannerOfChar(input);
                boolean Palindrone1 = Palindrone(input);
                int TotalNum = NoOfDigits(input);
                int TotalLet = CountLetters(input);
                int InputLength = input.length();
                boolean SpecialCharacters = ScannerOfChar(input);
                boolean Palindrone = Palindrone(input);



                if (InputLength > 12) {
                    streamWtr.println("mahaba");
                } else if (InputLength < 6) {
                    streamWtr.println("maiksi");
                } else if ((InputLength >= 6) && (InputLength <= 12)) {
                    if (SpecialCharacters1) {
                        streamWtr.println("may kakaibang karakter");
                    }
                    else if (TotalLet > TotalNum) {
                        streamWtr.println("maletra");
                    }
                    else if (TotalLet < TotalNum) {
                        streamWtr.println("manumero");
                    }
                    else if (TotalLet == TotalNum) {
                        streamWtr.println("katanggap-tanggap");
                        if (Palindrone1) break;
                    }
                }
            }

            streamWtr.println("paalam");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static int NoOfDigits(String string) {int NDigits;
        NDigits = 0;
        char[] ch = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(ch[i])) {
                NDigits++;
            }
        }
        return NDigits;
    }

    private static boolean ScannerOfChar(String string) { boolean specialC;
        Pattern path = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher match = path.matcher(string);

        specialC = match.find();
        return specialC;
    }

    private static boolean Palindrone(String string) { boolean pal = false;
        StringBuilder build = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            build.append(string.charAt(i));
        }
        pal = string.equalsIgnoreCase(build.toString());
        return pal;
    }


    private static int CountLetters(String string) {int cha = 0;
        char[] ch;
        ch = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(ch[i])) {
                cha++;
            }
        }
        return cha;
    }
}


