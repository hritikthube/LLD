import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class TicTacToeGame  {
    private static int gameId;
    int row;
    int col;
    private TicTacToeBoard ticTacToeBoard;
    private int currentPlayerIdx;
    private Map<Player,TicTacToeSymbol> mapper;
    private List<Player>players;

    public TicTacToeGame(int row, int col, Map<Player,TicTacToeSymbol> mapper) {
        this.row = row;
        this.col = col;
        this.mapper=mapper;
        currentPlayerIdx=0;
        gameId++;
        players=new ArrayList<>();
        for(Map.Entry<Player,TicTacToeSymbol>entry : mapper.entrySet() ) {
            {
            players.add(entry.getKey());
            }
        }
        ticTacToeBoard=new TicTacToeBoard(row,col);
    }

    public void displayBoard(){
        ticTacToeBoard.displayBoard();
    }

    public static int getGameId() {
        return gameId;
    }

    public int getCurrentPlayerIdx() {
        return currentPlayerIdx;
    }

    public void play(Move m)  {
    try {
       // displayBoard();
        validateMove(m);
    }
        catch (Exception e)
    {
        System.out.println("Invalid entry...");
        return;
    }
    ticTacToeBoard.set(m.getRowno(),m.getColno(),mapper.get(players.get(currentPlayerIdx)));
    displayBoard();
    if(hasWinner(players.get(currentPlayerIdx)))
    {
        System.out.println(players.get(currentPlayerIdx).getName() + "is the winner!!!");
    }

    currentPlayerIdx=(currentPlayerIdx+1)%players.size();
    }

    public boolean hasWinner(Player player) {
        return ticTacToeBoard.hasCapturedRow(mapper.get(player)) || ticTacToeBoard.hasCapturedCol(mapper.get(player)) || ticTacToeBoard.hasCapturedDiagonal(mapper.get(player));

    }

    private void validateMove(Move m) throws Exception {
        if(m.getRowno()<0 || m.getColno()<0 || m.getRowno()>=row || m.getColno()>=col || !"-".equals(ticTacToeBoard.getBoard()[m.getRowno()][m.getColno()].getSymbol()))
        {
            throw new Exception("Invalid Move");
        }
    }
}
