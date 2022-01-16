public class TicTacToeBoard {
    private int numRows;
    private int numCols;
    private TicTacToeSymbol [][]board ;
    private int rowtotal[];
    private int coltotal[];
    private int rowplayer1[];
    private int colplayer1[];
    private int diagonaltotal[];
    private int diagonalplayer1[];
    private int revdiagonaltotal[];
    private int revdiagonalplayer1[];

    public TicTacToeBoard(int row,int col) {
        this.numRows=row;
        this.numCols=col;
        board= new TicTacToeSymbol[row][col];
        rowtotal=new int[row];
        coltotal=new int[col];
        rowplayer1=new int[row];
        colplayer1=new int[col];
        diagonaltotal=new int[row];
        diagonalplayer1=new int [col];
         revdiagonaltotal=new int [col];
         revdiagonalplayer1=new int[row];
        init(board);
    }
   public void set(int r,int c,TicTacToeSymbol ticTacToeSymbol){
        board[r][c]=ticTacToeSymbol;
   }
    private void init(TicTacToeSymbol[][] board) {
        for(int i=0;i<numRows;i++)
            for(int j =0;j<numCols;j++)
                board[i][j]=new TicTacToeSymbol("-");
    }

    public void displayBoard(){
        for(int i=0;i<numRows;i++)
            for(int j =0;j<numCols;j++)
                System.out.println(board[i][j].getSymbol());
    }

    public TicTacToeSymbol[][] getBoard() {
        return board;
    }


    public boolean hasCapturedDiagonal(TicTacToeSymbol symbol) {
        boolean isCaptured=true;
        for(int i=0;i<numRows;i++)
        {
            if(!symbol.equals(board[i][i]))
            {isCaptured=false;}
        }
        if(isCaptured)return isCaptured;
        isCaptured=true;
        for(int i=0;i<numRows;i++)
        {
            if(!symbol.equals(board[i][numRows-1-i]))
            {isCaptured=false;}
        }
        return isCaptured;
    }

    public boolean hasCapturedCol(TicTacToeSymbol symbol) {
        for (int col = 0; col < numCols; col++) {
            boolean colOccupied = true;
            for (int row = 0; row < numRows; row++) {
                if (!symbol.equals(board[row][col])) {
                    colOccupied = false;
                    break;
                }
            }
            if (colOccupied)
                return true;
        }
        return false;
    }

    public boolean hasCapturedRow(TicTacToeSymbol symbol) {
        for (int row = 0; row < numRows; row++) {
            boolean rowOccupied = true;
            for (int col = 0; col < numCols; col++) {
                if (!symbol.equals(board[row][col])) {
                    rowOccupied = false;
                    break;
                }
            }
            if (rowOccupied)
                return true;
        }
        return false;
    }

    public void setBoard(TicTacToeSymbol[][] board) {
        this.board = board;
    }

    public int[] getRowtotal() {
        return rowtotal;
    }

    public void setRowtotal(int[] rowtotal) {
        this.rowtotal = rowtotal;
    }

    public int[] getColtotal() {
        return coltotal;
    }

    public void setColtotal(int[] coltotal) {
        this.coltotal = coltotal;
    }

    public int[] getRowplayer1() {
        return rowplayer1;
    }

    public void setRowplayer1(int[] rowplayer1) {
        this.rowplayer1 = rowplayer1;
    }

    public int[] getColplayer1() {
        return colplayer1;
    }

    public void setColplayer1(int[] colplayer1) {
        this.colplayer1 = colplayer1;
    }

    public int[] getDiagonaltotal() {
        return diagonaltotal;
    }

    public void setDiagonaltotal(int[] diagonaltotal) {
        this.diagonaltotal = diagonaltotal;
    }

    public int[] getDiagonalplayer1() {
        return diagonalplayer1;
    }

    public void setDiagonalplayer1(int[] diagonalplayer1) {
        this.diagonalplayer1 = diagonalplayer1;
    }

    public int[] getRevdiagonaltotal() {
        return revdiagonaltotal;
    }

    public void setRevdiagonaltotal(int[] revdiagonaltotal) {
        this.revdiagonaltotal = revdiagonaltotal;
    }

    public int[] getRevdiagonalplayer1() {
        return revdiagonalplayer1;
    }

    public void setRevdiagonalplayer1(int[] revdiagonalplayer1) {
        this.revdiagonalplayer1 = revdiagonalplayer1;
    }
}
