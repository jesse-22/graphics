package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    BouncingBox b1;
    BouncingBox b2;
    BouncingBox b3;
    ArrayList <BouncingBox> boxes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(0, 1);
        
        //** Initialize ArrayList for BouncingBoxes
        b1 = new BouncingBox(150, 50, Color.BLUE);
        b1.setMovementVector(0, -2);
        boxes.add(b1);
        b2 = new BouncingBox(20, 40, Color.magenta);
        b2.setMovementVector(1, 2);
        boxes.add(b2);
        b3 = new BouncingBox(100, 50, Color.green);
        b3.setMovementVector(2, -1);
        boxes.add(b3);
        
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        box.draw(surface);
        
        //** Go through ArrayList of boxes
        for (BouncingBox b : boxes) {
        	b.draw(surface);
        }
        
        
        //** Drawing 3 more shapes
        surface.drawArc(0, 50, 62, 50, 50, 360);
        surface.drawOval(20, 25, 200, 200);
        surface.draw3DRect(30, 32, 65, 30, false);
    }
} 
