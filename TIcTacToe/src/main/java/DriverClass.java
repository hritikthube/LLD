
import java.util.*;

public class DriverClass {
    public static void main(String[] args)  {
        Map<Player,TicTacToeSymbol> mapper =new HashMap<>();
        System.out.println("type ");

        mapper.put(new Player("hritik"),new TicTacToeSymbol("X"));
        mapper.put(new Player("santosh"),new TicTacToeSymbol("O"));
        TicTacToeGame tickTacToeGame =TicTacToeFactory.standard3X3Game(mapper);
        tickTacToeGame.play(new Move(0, 2 ));
        tickTacToeGame.play(new Move(0, 1));
        tickTacToeGame.play(new Move(1, 2 ));
        tickTacToeGame.play(new Move(1, 1));
        tickTacToeGame.play(new Move(2, 2 ));
        tickTacToeGame.play(new Move(1, 0));


    }
}
