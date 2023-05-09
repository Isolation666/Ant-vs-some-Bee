import Bee.Bee;

public class Pool {
    private Bullet antBullet;
    private Cost cost;
    private Bee bee;

    public Pool(Bullet antBullet, Cost cost, Bee bee) {
        this.antBullet = antBullet;
        this.cost = cost;
        this.bee = bee;
    }
}