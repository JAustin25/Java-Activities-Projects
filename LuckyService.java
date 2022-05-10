import java.util.Random;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Name: Andres, John Austin T.
 */
@WebService
public class AndresJohnAustinLuckyService{
    int min = 1; int max = 10;

    @WebMethod
    public int hit() throws RemoteException {
        Random random = new Random();
        return random.nextInt(max-min) + min;
    }

    @WebMethod
    public int getNum() throws RemoteException {
        return hit()+hit();
    }

    @WebMethod
    public String play(int playerNum) throws RemoteException {
        String result = " ";

        int serverNum = getNum();

        int sOneDigit = serverNum%10;
        int pOneDigit = playerNum%10;

        if(pOneDigit  < 5 || sOneDigit < 5){
            int serverNum2 = getNum();
            serverNum+=serverNum2;
        }

        sOneDigit = serverNum%10;

        if(playerOneDigit == serverOneDigit){
            result = "draw";
        }
        else if(playerOneDigit > serverOneDigit){
            result = "win";
        }
        else{
            result = "lose";
        }

        return result ;
    }
}