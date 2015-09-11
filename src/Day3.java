import TurtleGraphics.*;
public class Day3 {

    public static void main(String[] args) {
        SketchPadWindow win = new SketchPadWindow(600,400);
        Pen p = new StandardPen();
        int size=100;
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
        p.move(size);
        p.turn(90);
    }
    
}
