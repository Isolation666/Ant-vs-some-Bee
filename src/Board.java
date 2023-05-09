import java.util.List;

public class Board {
    private Grid[][] gridList;
    private int size;

    public Board(int size) {
        this.size = size;
    }
    private void initCells() {
        gridList = new Grid[size][size];

        for(int row=0; row<size; row++) {
            for(int column=0; column<size; column++) {
                gridList[row][column] = new Grid();
            }
        }
    }
}
