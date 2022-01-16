import java.util.List;
import java.util.Map;

public class TicTacToeFactory {
    public static TicTacToeGame standard3X3Game(Map<Player,TicTacToeSymbol> mapper){
        return new TicTacToeGame(3,3,mapper);
    }
    public static TicTacToeGame customizedGame(List<Player>players,int row,int col,Map<Player,TicTacToeSymbol> mapper){
        return new TicTacToeGame(row,col,mapper);
    }
}
