package pingball.datatypes;

import java.util.ArrayList;
import java.util.List;

import physics.Geometry;
import physics.LineSegment;
import physics.Vect;
import static org.junit.Assert.*;

public class OuterWall implements Gadget{
    
    private final LineSegment wall;
    private final double coR;
    private boolean solid;
    private final String name;
    private List<Gadget> gadgetsToFire;
    
    //Rep invariant:
    //name.length>0
    //wall located on boundaries of board
    //Abstraction function:
    
    public OuterWall(String name, double x0 , double y0, double x1, double y1, boolean solid){
        this.wall = new LineSegment(x0, y0, x1, y1);
        this.coR = 1.0;
        this.solid = solid;
        this.name = name;
        this.gadgetsToFire = new ArrayList<Gadget>();
        
        checkRep();
    }
    
    /**
     * fires the actions of gadgets in gadgetsToFire
     */
    private void trigger(){
        for (Gadget gadget : gadgetsToFire) {
            gadget.action();
        }
    }
    
    /**
     * no action i.e does not respond to any trigger
     */
    @Override
    public void action() {
        
    }
    
    /**
     * @return the coefficient of Reflection
     */
    @Override
    public double getCoR() {
        return new Double(coR).doubleValue();
    }
    
    /**
     * computes time until ball collides with wall
     * @param ball to collide with
     * @return time until ball collides with wall
     */
    @Override
    public double timeUntilCollision(Ball ball) {
        return Geometry.timeUntilWallCollision(wall, ball.getCircle(), ball.getVelocity());
    }
    
    /**
     * reflects the ball off wall,updates ball's velocity and triggers this gadget
     * @param ball to be reflected
     */
    @Override
    public void reflectOffGadget(Ball ball){
        //reflect only if solid
        if(solid){
            Vect newVelocityVector = Geometry.reflectWall(wall, ball.getVelocity(), coR);
            ball.setVelocity(newVelocityVector);
        }    
    }
    
    /**
     * @return list of gadgets that are fired when this gadget is triggered
     */
    public List<Gadget> getGadgetsToFire(){
        return null;
    }
    
    /**
     * adds gadget to gadgets to be fired when this gadget is triggered
     * @param gadget gadget to be added to the list of gadgets that are fired when this
     *          gadget is triggered
     */
    public void addGadgetToFire(Gadget gadget){
        
    }
    
    /**
     * @return String representation of the outer walls
     */
    @Override
    public String toString(){
        return null;
    }
    
    /**
     * check representation
     */
    private void checkRep(){
        assertTrue(name.length() > 0);
        assertTrue(wall.p1().x() == 0 || wall.p1().x() == 20);
        assertTrue(wall.p1().y() == 0 || wall.p1().y() == 20);
        assertTrue(wall.p2().x() == 0 || wall.p2().x() == 20);
        assertTrue(wall.p2().y() == 0 || wall.p2().y() == 20);
    }
    
    

}
