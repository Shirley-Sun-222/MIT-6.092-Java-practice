package Assignment5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	BouncingBox box;
	ArrayList<BouncingBox> boxlist = new ArrayList<BouncingBox>();
	
	/** Initializes this class for drawing. */
	public DrawGraphics() {
        // 创建第一个盒子并设置其移动方向
        BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
        box1.setMovementVector(3, 1);
        boxlist.add(box1);
        
        // 创建第二个盒子并设置其移动方向
        BouncingBox box2 = new BouncingBox(100, 150, Color.GREEN);
        box2.setMovementVector(-2, 4);
        boxlist.add(box2);

        // 创建第三个盒子并设置其移动方向
        BouncingBox box3 = new BouncingBox(50, 250, Color.BLUE);
        box3.setMovementVector(5, -3);
        boxlist.add(box3);
    }

	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
	surface.drawLine(50, 50, 250, 250);
	surface.drawOval(100, 100, 50, 50);
	surface.drawRect(150, 150, 50, 50);
	surface.drawString("Hello, World!", 180, 130);
	surface.setColor(Color.BLUE);
	surface.fillRect(50, 200, 100, 50);
	surface.setColor(Color.BLACK);
	surface.fillArc(200, 200, 50, 50, 0, 270);
	
	for (BouncingBox boxi : boxlist) {
		boxi.draw(surface);
	}
	}
}
