package pingball.datatypes;

import physics.LineSegment;

public class OuterWall implements Gadget{
    
    private final LineSegment wall;
    private final double coR;
    private boolean solid;
    private final String name;
    
    public OuterWall(double x0 , double y0, double x1, double y1, boolean solid, String name){
        this.wall = new LineSegment(x0, y0, x1, y1);
        this.coR = 1.0;
        this.solid = solid;
        this.name = name;
    }
    
    /**
     * doesn't generate any triggers
     * @return null because OuterWall does not generate any trigger
     */
    @Override
    public Trigger trigger() {
        return null;
    }
    
    /**
     * no action i.e does not respond to any trigger
     */
    @Override
    public void action(Trigger trigger) {
        
    }
    
    /**
     * @return the coefficient of Reflection
     */
    @Override
    public double getCoR() {
        return 0;
    }
    
    /**
     * @return String representation of the outer walls
     */
    @Override
    public String toString(){
        return null;
    }

    @Override
    public double timeUntilCollision(Ball ball) {
        return 0;
    }
    
    

}
