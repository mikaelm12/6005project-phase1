package warmup;

public class Board implements BoardInterface {
    
    private final double x;
    private final double y;
    private final double gravity;
    private final double mu;
    private final double mu2;

    /**
     * 
     * @param x width of board
     * @param y height of board
     */
    public Board(double x,double y){
        this.x = x;
        this.y = y;
        this.gravity = 0;
        this.mu = 0;
        this.mu2 = 0;
    }
    
    @Override
    public double getBoardGravity() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getMu() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getMu2() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double[] getBallPosition() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setBallPosition(double x, double y) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double[] getBoardSize() {
        // TODO Auto-generated method stub
        return null;
    }

}
