package BoardExpr;



public class Main {
    
    public static void main(String[] args) {
         BoardFactory.parse("board name=sampleBoard2_1 gravity=20.0 friction1=0.020 friction2=0.020\n" +
"# This board is meant for multiple players. It is a loose\n" +

  "# define a ball\n"+
  "ball name=Ball x=0.5 y=0.5 xVelocity=2.5 yVelocity=2.5\n"+

  "# define a series of square bumpers\n" +
 " squareBumper name=Square0 x=2 y=2"+
  "leftFlipper name=FlipL2 x=16 y=9 orientation=0"+
" circleBumper name=Circle10 x=10 y=3" +
 "circleBumper name=Circle11 x=11 y=4" + 
 "circleBumper name=Circle12 x=12 y=5"+
 "triangleBumper name=Tri12 x=5 y=5 orientation=0"+
 "absorber name=Abs x=0 y=19 width=20 height=1 "+
 "fire trigger=Abs action=Abs ");

 

        
    }

}
