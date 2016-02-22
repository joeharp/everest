package core;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * Wrapper class, used a program entry point and allows OS and PC specific config.
 */
public class Wrapper extends JFrame{

	private static final long serialVersionUID = 1L;
	
	//Cosmetic Fields
	private Dimension resolution = new Dimension(800, 600);
	private String title = "Everest";
	
	//Fields
	private RenderFrame rf;
	
	/**
	 * Constructor
	 */
	public Wrapper(){
		initAddComponenets();
		init();
	}
	
	
	/**
	 * Main Class
	 * Creates a new Wrapper object which starts the program.
	 * @param args
	 */
	public static void main(String[] args) {
		new Wrapper();
	}
	
	/**
	 * Initializes the component
	 */
	private void init(){
		this.setTitle(title);
		this.setSize(resolution);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.setVisible(true);
	}
	
	/**
	 * Used to add components before calling init()
	 */
	private void initAddComponenets(){
		rf = new RenderFrame(resolution);
		this.add(rf);
	}

}
