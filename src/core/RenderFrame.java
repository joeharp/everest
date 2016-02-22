package core;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * RenderFrame class is able to be chucked into a container such as a JFrame.
 *
 */
public class RenderFrame extends Canvas {
	
	private static final long serialVersionUID = 1L;
	
	private Dimension resolution;
	
	public RenderFrame(Dimension r) {
		resolution = r;
		init();
	}
	
	public void paint(Graphics g){
		//paint image here
		g.drawRect(0, 0, (int) resolution.getWidth(), (int) resolution.getHeight());
	}
	
	
	private void init(){
		setPreferredSize(resolution);
		setMinimumSize(resolution);
		setMaximumSize(resolution);
		this.setSize(resolution);
		setVisible(true);
	}

}