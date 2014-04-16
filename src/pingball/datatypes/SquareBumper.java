package pingball.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import physics.Geometry;
import physics.LineSegment;
import physics.Vect;


public class SquareBumper implements Gadget{
    
    private final double coR;
    private final double edgeLength;
    private final LineSegment top;
    private final LineSegment right;
    private final LineSegment bottom;
    private final LineSegment left;
    private final List<LineSegment> edges;
    private final String name;
    private List<Gadget> gadgetsToFire; 
    
    //Rep invariant:
    //edgeLength = 1.0,name!=null && name.length>0
    //Abstraction Function:
    //the four lineSegments represent a square
    
    public SquareBumper(String name, double x, double y){
        assert(x>=0 && x<=19);
        assert(y>=0 && y<=19);
        this.name = name;
        this.edgeLength = 1.0;
        this.coR = 1.0;
        this.top = new LineSegment(x,y,x+1,y);
        this.right = new LineSegment(x+1,y,x+1,y+1);
        this.bottom = new LineSegment(x,y+1,x+1,y+1);
        this.left = new LineSegment(x,y,x,y+1);
        this.gadgetsToFire = new ArrayList<Gadget>();
        this.edges = new ArrayList<LineSegment>();
        edges.addAll(Arrays.asList(left,top,right,bottom));
        
        checkRep();
    }
    
    /**
     * triggers the actions of gadgets in gadgetsToFire
     */
    @Override
    public void trigger(){
        for (Gadget gadget : gadgetsToFire) {
            gadget.action();
        }
    }
    
    /**
     * no action i.e does not respond to any trigger
     */
    @Override
    public void action(){
        
    }
    
    /**
     * @return the coefficient of Reflection
     */
    @Override
    public double getCoR(){
        return new Double(this.coR).doubleValue();
    }
    
    
    /**
     * @param ball to collide
     * @return time until ball collides with bumper
     */
    @Override
    public double timeUntilCollision(Ball ball) {
        double closestTimeToCollision = 10000; //default value since double has to be initialized
        for (LineSegment edge : edges) {
            double timeToEdge = Geometry.timeUntilWallCollision(edge, ball.getCircle(), ball.getVelocity());
            if(timeToEdge < closestTimeToCollision){
                closestTimeToCollision = timeToEdge;
            }
        }
        return closestTimeToCollision;
    }
    
    /**
     * reflects the ball off gadget
     * @param ball to be reflected
     * @return the new velocity vector of the ball
     */
    @Override
    public Vect reflectOffGadget(Ball ball){
        return null;
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
     * @return string representation of the SquareBumper
     */
    @Override
    public String toString(){
        return "Bumper";
    }
    
    /**
     * checks rep invariant
     */
    private void checkRep(){
        assert(this.edgeLength == 1.0);
    }

}
