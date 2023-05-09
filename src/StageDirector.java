import Ant.Ant;

public class StageDirector {
    private Board board;
    private Pool objPool;
    private Ant ant;
    private int totalCost;

    public StageDirector(Board board, Pool objPool, Ant ant, int totalCost) {
        this.board = board;
        this.objPool = objPool;
        this.ant = ant;
        this.totalCost = totalCost;
    }
}
